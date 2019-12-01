package com.yxe.application.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxe.application.service.BaseService;
import com.yxe.application.util.PageInfo;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private Mapper<T> mapper;

	@Override
	public PageInfo<T> selectByPage(Example example, PageInfo<T> page) {
		if (null == page) {
			page = new PageInfo<T>();
		}
		int total = mapper.selectCountByExample(example);
		page.setTotal(total);

		List<T> list = new ArrayList<T>();
		if (total > 0) {
			if (total % page.getPageSize() > 0) {
				page.setPages(total / page.getPageSize() + 1);
			} else {
				page.setPages(total / page.getPageSize());
			}
			page.setStartRow((page.getPageNum() - 1) * page.getPageSize());
			list = mapper.selectByExampleAndRowBounds(example, new RowBounds(page.getStartRow(), page.getPageSize()));
			page.setHasPreviousPage(page.getPageNum() > 1);
			page.setHasNextPage(page.getPageNum() < page.getPages());
		} else {
			page.setPages(0);
		}
		page.setList(list);
		page.setSize(list.size());
		return page;
	}

	@SuppressWarnings("unchecked")
	@Override
	public PageInfo<T> selectByJoinPage(Map<String, Object> param, PageInfo<T> page) {
		if (!param.containsKey("select_join_count")) {
			throw new RuntimeException("必须包含多表关联查询计算总数的方法名称(select_join_count)参数");
		}
		if (!param.containsKey("select_join_list")) {
			throw new RuntimeException("必须包含多表关联查询查询某一页的方法名称(select_join_list)参数");
		}

		if (null == page) {
			page = new PageInfo<T>();
		}

		Method methodCount = null;
		List<T> list = new ArrayList<T>();
		try {
			methodCount = mapper.getClass().getMethod(param.get("select_join_count") + "", Class.forName("java.util.Map"));
			long total = (int) methodCount.invoke(mapper, param);
			page.setTotal(total);
			if (total > 0) {
				if (total % page.getPageSize() > 0) {
					page.setPages((int) (total / page.getPageSize()) + 1);
				} else {
					page.setPages((int) (total / page.getPageSize()));
				}

				page.setStartRow((page.getPageNum() - 1) * page.getPageSize());
				param.put("startRow", page.getStartRow());
				param.put("pageSize", page.getPageSize());
				Method methodList = mapper.getClass().getMethod(param.get("select_join_list") + "", Class.forName("java.util.Map"));
				list = (List<T>) methodList.invoke(mapper, param);

				page.setHasPreviousPage(page.getPageNum() > 1);
				page.setHasNextPage(page.getPageNum() < page.getPages());
			} else {
				page.setPages(0);
			}
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		page.setList(list);
		page.setSize(list.size());
		return page;
	}

}

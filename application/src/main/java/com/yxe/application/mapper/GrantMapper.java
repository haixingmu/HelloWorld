package com.yxe.application.mapper;

import java.util.List;
import java.util.Map;

import com.yxe.application.po.Grant;

import tk.mybatis.mapper.common.Mapper;

public interface GrantMapper extends Mapper<Grant> {
	List<Grant> getListByRole(Grant param);
	
	List<Grant> getListByParentId(Grant param);
	
	List<Grant> getListByAgent(Map<String, Object> param);
	
	List<Grant> getListWithCountOfChildren(Grant param);
}

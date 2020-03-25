package com.yxe.application.config.mybatis;

import tk.mybatis.mapper.common.Mapper;

public interface MyBaseMapper<T> extends Mapper<T> {
//	@SelectProvider(type = MyBaseMapperProvider.class, method = "dynamicSQL")
//	PageInfo<T> selectByPage(Example example, PageInfo<T> page);
}

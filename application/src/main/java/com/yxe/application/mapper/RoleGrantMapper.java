package com.yxe.application.mapper;

import java.util.List;

import com.yxe.application.po.RoleGrant;

import tk.mybatis.mapper.common.Mapper;

public interface RoleGrantMapper extends Mapper<RoleGrant> {
	void batchInsert(List<RoleGrant> data);
}

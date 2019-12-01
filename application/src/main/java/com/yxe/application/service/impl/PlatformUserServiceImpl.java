package com.yxe.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxe.application.exception.BusinessException;
import com.yxe.application.mapper.PlatformUserMapper;
import com.yxe.application.po.PlatformUser;
import com.yxe.application.service.PlatformUserService;
@Service
public class PlatformUserServiceImpl extends BaseServiceImpl<PlatformUser> implements PlatformUserService {
	@Autowired
	private PlatformUserMapper mapper;
	
	@Override
	public PlatformUser login(PlatformUser param) {
		PlatformUser record = new PlatformUser();
		record.setUsername(param.getUsername());
		PlatformUser result = mapper.selectOne(record);
		if (null == result) {
			throw new BusinessException("无此用户！！！");
		}
		
		if (!param.getPassword().equals(result.getPassword())) {
			throw new BusinessException("密码错误！请重新输入");
		}
		return result;
	}
}

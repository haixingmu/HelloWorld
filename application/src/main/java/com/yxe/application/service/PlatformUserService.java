package com.yxe.application.service;

import com.yxe.application.po.PlatformUser;

public interface PlatformUserService extends BaseService<PlatformUser> {

	PlatformUser login(PlatformUser param);

}

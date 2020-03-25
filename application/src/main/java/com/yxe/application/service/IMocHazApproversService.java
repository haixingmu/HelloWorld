package com.yxe.application.service;

import java.util.List;
import java.util.Map;

import com.yxe.application.po.MocHazApprovers;

public interface IMocHazApproversService extends BaseService<MocHazApprovers> {

	List<MocHazApprovers> getList(Map<String, Object> param);

}

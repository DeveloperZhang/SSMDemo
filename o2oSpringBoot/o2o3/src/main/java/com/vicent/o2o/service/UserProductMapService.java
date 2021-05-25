package com.vicent.o2o.service;

import com.vicent.o2o.dto.UserProductMapExecution;
import com.vicent.o2o.entity.UserProductMap;
import com.vicent.o2o.exceptions.UserProductMapOperationException;

public interface UserProductMapService {
	/**
	 * 通过传入的查询条件分页列出用户消费信息列表
	 * 
	 * @param shopId
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	UserProductMapExecution listUserProductMap(UserProductMap userProductCondition, Integer pageIndex,
			Integer pageSize);

}

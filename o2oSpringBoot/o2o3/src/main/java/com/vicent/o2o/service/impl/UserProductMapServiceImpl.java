package com.vicent.o2o.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vicent.o2o.dao.UserProductMapDao;
import com.vicent.o2o.dto.UserProductMapExecution;
import com.vicent.o2o.entity.PersonInfo;
import com.vicent.o2o.entity.Shop;
import com.vicent.o2o.entity.UserProductMap;
import com.vicent.o2o.enums.UserProductMapStateEnum;
import com.vicent.o2o.exceptions.UserProductMapOperationException;
import com.vicent.o2o.service.UserProductMapService;
import com.vicent.o2o.util.PageCalculator;

@Service
public class UserProductMapServiceImpl implements UserProductMapService {
	@Autowired
	private UserProductMapDao userProductMapDao;

	@Override
	public UserProductMapExecution listUserProductMap(UserProductMap userProductCondition, Integer pageIndex,
			Integer pageSize) {
		// 空值判断
		if (userProductCondition != null && pageIndex != null && pageSize != null) {
			// 页转行
			int beginIndex = PageCalculator.calculateRowIndex(pageIndex, pageSize);
			// 依据查询条件分页取出列表
			List<UserProductMap> userProductMapList = userProductMapDao.queryUserProductMapList(userProductCondition,
					beginIndex, pageSize);
			// 按照同等的查询条件获取总数
			int count = userProductMapDao.queryUserProductMapCount(userProductCondition);
			UserProductMapExecution se = new UserProductMapExecution();
			se.setUserProductMapList(userProductMapList);
			se.setCount(count);
			return se;
		} else {
			return null;
		}

	}
}

package com.vicent.o2o.service.impl;

import com.vicent.o2o.dao.AreaDao;
import com.vicent.o2o.entity.Area;
import com.vicent.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaDao areaDao;
	
	public List<Area> getAreaList(){
		return areaDao.queryArea();
	}

}

package com.imooc.o2o.dao;

import java.util.List;

import com.imooc.o2o.entity.Area;

public interface AreaDao {
	/**
	 *列出取余列表
	 *@return areaList 
	 */
	List<Area> queryArea();
}

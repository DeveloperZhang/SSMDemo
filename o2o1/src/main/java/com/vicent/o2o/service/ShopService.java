package com.vicent.o2o.service;

import com.vicent.o2o.dto.ShopExecution;
import com.vicent.o2o.entity.Shop;
import com.vicent.o2o.exceptions.ShopOperationException;

import java.io.InputStream;


public interface ShopService {

	/**
	 * 注册店铺信息，包括图片处理
	 *
	 * @param shop
	 * @param shopImgInputStream
	 * @param fileName
	 * @return
	 * @throws ShopOperationException
	 */
	ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;
	
	/**
	 * 通过店铺Id获取店铺信息
	 *
	 * @param shopId
	 * @return
	 */
	Shop getByShopId(long shopId);
	
	/**
	 * 更新店铺信息，包括对图片的处理
	 *
	 * @param shop
	 * @param fileName
	 * @return
	 * @throws ShopOperationException
	 */
	ShopExecution modifyShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;
	
	/**
	 * 根据shopCondition分页返回相应店铺列表
	 *
	 * @param shopCondition
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
}

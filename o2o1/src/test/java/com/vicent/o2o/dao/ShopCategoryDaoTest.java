package com.vicent.o2o.dao;

import com.vicent.o2o.BaseTest;
import com.vicent.o2o.entity.ShopCategory;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopCategoryDaoTest extends BaseTest {
	@Autowired
	private ShopCategoryDao shopCategoryDao;

	@Test
	@Ignore
	public void testQueryShopCategory() {
		List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(null);
		ShopCategory testCategory = new ShopCategory();
		ShopCategory parentCategory = new ShopCategory();
		parentCategory.setShopCategoryId(12L);
		testCategory.setParent(parentCategory);
		shopCategoryList = shopCategoryDao.queryShopCategory(testCategory);
		assertEquals(3,shopCategoryList.size());
		System.out.println(shopCategoryList.get(0).getShopCategoryName());
	}
	
	@Test
	public void testQueryTopShopCategory() {
		List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(null);
		System.out.println(shopCategoryList.size());
	}
}

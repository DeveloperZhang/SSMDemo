package com.vicent.o2o.service;

import com.vicent.o2o.entity.ShopCategory;

import java.util.List;

public interface ShopCategoryService {
    public static final String SCLISTKEY = "shopcategorylist";
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}

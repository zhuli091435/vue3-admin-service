package com.li.vue3adminservice.service;

import com.li.vue3adminservice.pojo.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【category(商品分类表)】的数据库操作Service
* @createDate 2025-09-08 10:04:49
*/
public interface CategoryService extends IService<Category> {

    List<Category> getCategoryLevel1();

    List<Category> getCategory2ByC1Id(Integer c1Id);

    List<Category> getCategory3ByC2Id(Integer c2Id);
}

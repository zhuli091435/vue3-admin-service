package com.li.vue3adminservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.vue3adminservice.pojo.Category;
import com.li.vue3adminservice.service.CategoryService;
import com.li.vue3adminservice.mapper.CategoryMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【category(商品分类表)】的数据库操作Service实现
 * @createDate 2025-09-08 10:04:49
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Resource
    CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryLevel1() {
        LambdaQueryWrapper<Category> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.isNull(Category::getParentId);
        return categoryMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Category> getCategory2ByC1Id(Integer c1Id) {
        LambdaQueryWrapper<Category> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Category::getParentId, c1Id);
        return categoryMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Category> getCategory3ByC2Id(Integer c2Id) {
        LambdaQueryWrapper<Category> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Category::getParentId, c2Id);
        return categoryMapper.selectList(lambdaQueryWrapper);
    }
}





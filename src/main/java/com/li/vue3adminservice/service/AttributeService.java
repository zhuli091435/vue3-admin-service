package com.li.vue3adminservice.service;

import com.li.vue3adminservice.pojo.Attribute;
import com.baomidou.mybatisplus.extension.service.IService;
import com.li.vue3adminservice.pojo.vo.AttributeVO;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【attribute(商品属性表)】的数据库操作Service
 * @createDate 2025-09-08 16:18:57
 */
public interface AttributeService extends IService<Attribute> {
    List<AttributeVO> getAttributesByCategoryId(Long categoryId);
}

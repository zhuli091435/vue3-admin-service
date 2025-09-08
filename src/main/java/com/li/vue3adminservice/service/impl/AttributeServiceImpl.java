package com.li.vue3adminservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.vue3adminservice.mapper.AttributeValueMapper;
import com.li.vue3adminservice.pojo.Attribute;
import com.li.vue3adminservice.pojo.AttributeValue;
import com.li.vue3adminservice.pojo.vo.AttributeVO;
import com.li.vue3adminservice.service.AttributeService;
import com.li.vue3adminservice.mapper.AttributeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @description 针对表【attribute(商品属性表)】的数据库操作Service实现
 * @createDate 2025-09-08 16:18:57
 */
@Service
public class AttributeServiceImpl extends ServiceImpl<AttributeMapper, Attribute> implements AttributeService {
    @Resource
    private AttributeMapper attributeMapper;

    @Resource
    private AttributeValueMapper attributeValueMapper;

    @Override
    public List<AttributeVO> getAttributesByCategoryId(Long categoryId) {
        // 查询属性
        List<Attribute> attrs = attributeMapper.selectList(
                new LambdaQueryWrapper<Attribute>()
                        .eq(Attribute::getCategoryId, categoryId)
                        .orderByAsc(Attribute::getSort)
        );

        // 查询属性值并封装
        return attrs.stream().map(attr -> {
            AttributeVO vo = new AttributeVO();
            vo.setId(attr.getId());
            vo.setName(attr.getName());
            vo.setType(attr.getType());

            List<AttributeValue> values = attributeValueMapper.selectList(
                    new LambdaQueryWrapper<AttributeValue>()
                            .eq(AttributeValue::getAttributeId, attr.getId())
                            .orderByAsc(AttributeValue::getSort)
            );
            vo.setValues(values);
            return vo;
        }).toList();
    }
}





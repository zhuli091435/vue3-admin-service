package com.li.vue3adminservice.controller;


import com.li.vue3adminservice.pojo.vo.CodeMessageVO;
import com.li.vue3adminservice.service.AttributeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attribute")
public class AttributeController {

    @Resource
    AttributeService attributeService;

    @GetMapping("/list/{categoryId}")
    public CodeMessageVO getAttributesByCategoryId(@PathVariable Long categoryId) {
        return new CodeMessageVO(200, "succeed", attributeService.getAttributesByCategoryId(categoryId));
    }
}

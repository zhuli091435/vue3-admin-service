package com.li.vue3adminservice.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.li.vue3adminservice.pojo.Category;
import com.li.vue3adminservice.pojo.Trademark;
import com.li.vue3adminservice.pojo.vo.CodeMessageVO;
import com.li.vue3adminservice.service.CategoryService;
import com.li.vue3adminservice.service.TrademarkService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    CategoryService categoryService;

    @GetMapping("/getLevel1")
    public CodeMessageVO getCategory1() {
        List<Category> list = categoryService.getCategoryLevel1();
        return new CodeMessageVO(200, "succeed", list);
    }

    @GetMapping("/getLevel2/{c1Id}")
    public CodeMessageVO getCategory2ByC1Id(@PathVariable Integer c1Id) {
        List<Category> list = categoryService.getCategory2ByC1Id(c1Id);
        return new CodeMessageVO(200, "succeed", list);
    }

    @GetMapping("/getLevel3/{c2Id}")
    public CodeMessageVO getCategory3ByC2Id(@PathVariable Integer c2Id) {
        List<Category> list = categoryService.getCategory3ByC2Id(c2Id);
        return new CodeMessageVO(200, "succeed", list);
    }
}

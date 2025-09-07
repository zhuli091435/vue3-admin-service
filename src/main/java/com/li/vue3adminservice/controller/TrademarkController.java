package com.li.vue3adminservice.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.li.vue3adminservice.pojo.Trademark;
import com.li.vue3adminservice.pojo.User;
import com.li.vue3adminservice.pojo.vo.CodeMessageVO;
import com.li.vue3adminservice.service.TrademarkService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@RestController
@RequestMapping("/trademark")
public class TrademarkController {
    private static final String UPLOAD_DIR = System.getProperty("user.dir") + "/upload/files/trademark/";
    @Resource
    TrademarkService trademarkService;

    @GetMapping("/{page}/{size}")
    public CodeMessageVO pageTrademarks(@PathVariable int page, @PathVariable int size) {
        return new CodeMessageVO(200, "succeed", trademarkService.page(new Page<>(page, size)));
    }

    @PostMapping("/upload")
    public CodeMessageVO upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {

        try {
            if (file.isEmpty()) {
                return new CodeMessageVO(201, "上传文件为空");
            }

            // 获取原始文件名
            String originalFilename = file.getOriginalFilename();
            // 防止文件名重复，用 UUID 生成新文件名
            String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
            String newFileName = UUID.randomUUID() + ext;

            // 保存到本地
            File dest = new File(UPLOAD_DIR + newFileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            file.transferTo(dest);

            // 返回访问 URL（这里假设通过 http://localhost:8080/files/ 访问）
            // 拼接完整 URL
            String scheme = request.getScheme(); // http 或 https
            String host = request.getServerName(); // IP 或域名
            int port = request.getServerPort(); // 端口

            String url = scheme + "://" + host + ":" + port + "/files/trademark/" + newFileName;
            return new CodeMessageVO(200, "上传成功", url);
        } catch (Exception e) {
            return new CodeMessageVO(201, "上传失败: " + e.getMessage());
        }
    }

    @PostMapping("/add")
    public CodeMessageVO add(@RequestBody Trademark trademark) {
        if (trademarkService.save(trademark)) {
            return new CodeMessageVO(200, "succeed");
        } else {
            return new CodeMessageVO(201, "添加失败");
        }
    }

    @PostMapping("/update")
    public CodeMessageVO update(@RequestBody Trademark trademark) {
        if (trademarkService.updateById(trademark)) {
            return new CodeMessageVO(200, "succeed");
        } else {
            return new CodeMessageVO(201, "修改失败");
        }
    }

    @DeleteMapping("/remove/{id}")
    public CodeMessageVO remove(@PathVariable Integer id) {
        if (trademarkService.removeById(id)) {
            return new CodeMessageVO(200, "succeed");
        } else {
            return new CodeMessageVO(201, "删除失败");
        }
    }
}

package com.li.vue3adminservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${file.upload-dir}")
    private String uploadDir; // 配置上传文件夹路径

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 映射 /files/** URL 到本地目录
        registry.addResourceHandler("/files/**")
                .addResourceLocations("file:" + uploadDir);
    }
}
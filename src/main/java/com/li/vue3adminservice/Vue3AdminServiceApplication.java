package com.li.vue3adminservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.li.vue3adminservice.mapper")  // ✅ 扫描 Mapper 包
public class Vue3AdminServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Vue3AdminServiceApplication.class, args);
    }

}

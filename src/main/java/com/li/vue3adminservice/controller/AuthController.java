package com.li.vue3adminservice.controller;

import com.li.vue3adminservice.pojo.User;
import com.li.vue3adminservice.pojo.vo.CodeMessageVO;
import com.li.vue3adminservice.service.UserService;
import com.li.vue3adminservice.util.JwtUtil;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public CodeMessageVO login(@RequestBody User user) {
        return userService.checkUserLogin(user);
    }

    @PostMapping("/userinfo")
    public CodeMessageVO userinfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        User user = userService.getById(Integer.parseInt(name));
        if (user != null) {
            return new CodeMessageVO(200, "", user);
        } else {
            return new CodeMessageVO(201, "获取失败");
        }
    }
}

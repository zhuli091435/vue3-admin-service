package com.li.vue3adminservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.vue3adminservice.pojo.User;
import com.li.vue3adminservice.pojo.vo.CodeMessageVO;
import com.li.vue3adminservice.service.UserService;
import com.li.vue3adminservice.mapper.UserMapper;
import com.li.vue3adminservice.util.JwtUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author zhuli
 * @description 针对表【user(用户表)】的数据库操作Service实现
 * @createDate 2025-09-06 14:54:35
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public CodeMessageVO checkUserLogin(User user) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username", user.getUsername());
        User userSelect = userMapper.selectOne(userQueryWrapper);
        if (userSelect != null && userSelect.getPassword().equals(user.getPassword())) {
            String token = JwtUtil.generateToken(userSelect.getId().toString());
            return new CodeMessageVO(200, "success", token);
        }
        return new CodeMessageVO(201, "用户名或者密码错误");
    }
}





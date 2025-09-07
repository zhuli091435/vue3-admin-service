package com.li.vue3adminservice.service;

import com.li.vue3adminservice.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.li.vue3adminservice.pojo.vo.CodeMessageVO;

/**
* @author zhuli
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2025-09-06 14:54:35
*/
public interface UserService extends IService<User> {

    CodeMessageVO checkUserLogin(User user);
}

package com.nageoffer.shortlink.admin.controller;


import cn.hutool.core.bean.BeanUtil;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *  现在 restful 风格 已经忘记了呢
 *  PathVariable 为什么使用这个注解呢 ？
 *  getMapping 已经忘了
 */
@RestController // @Controller  + @ResponseBody
// 通过构造器注入方式 不用autowire
// 注入方式

//
@RequiredArgsConstructor
public class UserController{
    // 使用构造器的方式注入
    private final UserService userService;
    // requestMapping + mappingMethod = get
    @GetMapping("/api/link/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username) {

        return userService.getUserByUsername(username);
    }
}

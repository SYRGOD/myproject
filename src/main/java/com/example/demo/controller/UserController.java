package com.example.demo.controller;

import com.example.demo.pojo.Result;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService; // 注入service对象


     //查询全部用户数据

    @GetMapping("/users")
    public Result list() {
        log.info("查询全部用户数据");
        List<User> userList = userService.list();
        return Result.success(userList);
    }


     //根据id删除用户

    @DeleteMapping("/users/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据id删除用户: {}", id);
        userService.delete(id); // 调用service删除用户
        return Result.success();
    }


     //新增用户

    @PostMapping("/users")
    public Result add(@RequestBody User user) {
        log.info("新增用户: {}", user);
        userService.add(user);// 调用service新增用户
        return Result.success();
    }
}
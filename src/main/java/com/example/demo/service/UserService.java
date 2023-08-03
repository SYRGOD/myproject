package com.example.demo.service;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //查询全部用户数据
    List<User>list();
//删除
    void delete(Integer id);
//新增
    void add(User user);
}

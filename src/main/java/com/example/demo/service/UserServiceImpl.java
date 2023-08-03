package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    //调用mapper接口中的方法
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User>list(){
        return userMapper.list();
    }



    @Override
    public void delete(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void add(User user) {

        userMapper.insert(user);
    }
}

package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
//查询
    @Select("select *from test.user ")
    List<User>list();
//根据id删除用户
    @Delete("delete from user where id = #{id}")
    void deleteById(Integer id);
//新增用户
    @Insert("insert into user(name) values(#{name})")
    void insert(User user);
}

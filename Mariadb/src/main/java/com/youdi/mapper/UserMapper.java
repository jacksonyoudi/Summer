package com.youdi.mapper;

import com.youdi.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> selectUser();

    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user (id, name, password) value (#{id}, #{name}, #{password}})")
    int addUser(User user);
}

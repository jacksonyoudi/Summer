package com.youdi.dao;

import com.youdi.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    User getUserById(Integer id);

    int addUser(User user);

    int updateUser(User user);

    int addUserOfMap(Map<String, Object> map);



}

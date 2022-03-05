package com.youdi.dao;

import com.youdi.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getUserList();

    public User getUserById(Integer id);

    public int addUser(User user);
    int updateUser(User user);
}

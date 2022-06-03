package com.youdi.mapper;

import com.youdi.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @program: Summer
 * @description:
 * @author: changyouliang
 * @date: 2022/03/26
 * <p>
 * 原来使用sqlsession来操作的，现在都是使用 sqlSessionTemplate
 **/
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSessionTemplate;


    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}

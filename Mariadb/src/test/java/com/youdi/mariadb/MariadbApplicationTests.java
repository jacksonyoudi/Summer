package com.youdi.mariadb;


import com.youdi.mapper.UserMapper;
import com.youdi.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class MariadbApplicationTests {

    @Test
    public void user() throws IOException {
        String source = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(source);

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);

        SqlSession session = build.openSession(true);

        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println("user" + user);
        }

        session.close();
    }

}

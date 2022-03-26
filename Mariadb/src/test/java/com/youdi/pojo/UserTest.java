package com.youdi.pojo;


import com.youdi.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;


class UserTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        context.close();
    }

    @Test
    public void user() throws IOException {

    }
}


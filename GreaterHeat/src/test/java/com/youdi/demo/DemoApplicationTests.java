package com.youdi.demo;


import com.youdi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class DemoApplicationTests {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 动态代理，代理的是接口
        UserService userservice = (UserService) context.getBean("userService");

        userservice.create();

    }

}

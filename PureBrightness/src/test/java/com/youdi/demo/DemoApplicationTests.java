package com.youdi.demo;

import com.youdi.config.YoudiConfig;
import com.youdi.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext context = new AnnotationConfigApplicationContext(YoudiConfig.class);
        User user = context.getBean("getuser", User.class);
        System.out.println(user);


    }

}

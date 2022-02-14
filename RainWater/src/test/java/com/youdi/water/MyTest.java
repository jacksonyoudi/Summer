package com.youdi.water;

import com.youdi.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testHello() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student);
        System.out.println(student.getAddress().getAddress());

    }
}

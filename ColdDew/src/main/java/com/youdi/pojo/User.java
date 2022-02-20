package com.youdi.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于  <bean id="userid" class="com.youdi.pojo.User"/>
@Component
public class User {

    // 相当于  <property name="name" value="youdi"/>
    @Value("youdi")
    public String name;
}

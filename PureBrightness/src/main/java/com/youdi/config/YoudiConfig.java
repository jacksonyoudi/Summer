package com.youdi.config;

import com.youdi.pojo.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Configurable // 也会被spring容器进行托管，注册到容器中，因为本身就是一个 @Compant
@ComponentScan("com.youdi.pojo")
public class YoudiConfig {

    // 注册一个bean，就相当于一个xml中的一个bean标签
    @Bean
    public User getuser() {
        return new User();
    }
}

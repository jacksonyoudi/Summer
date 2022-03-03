package com.youdi.log;


import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;


public class AfterLog implements AfterReturningAdvice {
    // returnValue 返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + target.getClass().getName() + "的" + method.getName() + "返回结果是" + returnValue);
    }
}

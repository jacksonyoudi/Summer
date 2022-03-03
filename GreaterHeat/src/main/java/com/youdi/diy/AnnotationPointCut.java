package com.youdi.diy;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // 标注是类是一个切面
public class AnnotationPointCut {

    @Before("execution(*  com.youdi.service.UserServiceImp.*(..))")
    public void before() {
        System.out.println("======AnnotationPointCut执行前===============");
    }

    @After("execution(*  com.youdi.service.UserServiceImp.*(..))")
    public void after() {
        System.out.println("======AnnotationPointCut执行后===============");
    }

}

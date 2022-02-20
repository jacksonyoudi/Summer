package com.youdi.demo1;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class UserServiceProxy implements UserService {
    private UserServiceImp userServiceImp;


    public void setUserServiceImpl(UserServiceImp userServiceImpl) {
        this.userServiceImp = userServiceImpl;
    }

    @Override
    public void add() {
        log("add");
        userServiceImp.add();
    }

    @Override
    public void delete() {
        log("add");
        userServiceImp.delete();
    }

    @Override
    public void update() {
        log("add");
        userServiceImp.update();
    }

    @Override
    public void query() {
        log("add");
        userServiceImp.query();
    }

    public void log(String msg) {
        System.out.println("[Debug] 调用" + msg + " 方法");
    }
}

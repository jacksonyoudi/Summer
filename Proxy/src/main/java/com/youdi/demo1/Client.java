package com.youdi.demo1;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserServiceImpl(new UserServiceImp());
        proxy.add();
    }
}

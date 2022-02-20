package com.youdi.demo2.demo;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        // 代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();

        handler.setRent(host);

        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();

    }
}

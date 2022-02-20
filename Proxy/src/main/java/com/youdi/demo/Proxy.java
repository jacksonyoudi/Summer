package com.youdi.demo;

public class Proxy implements Rent {
    private Host host;

    public Proxy() {

    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        System.out.println("中介租房~~~~");
        host.rent();
    }


    public void seeHouse() {
        System.out.println("看房");
    }

}

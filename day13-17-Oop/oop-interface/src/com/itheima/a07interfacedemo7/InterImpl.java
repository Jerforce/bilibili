package com.itheima.a07interfacedemo7;

public class InterImpl implements Inter {
    //不叫重写
    public static void show() {
        System.out.println("InterImpl重写的抽象方法");
    }

    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }

}

package com.study.spring.bingx.design;

/**
 * 饿汉式 线程安全，效率比较低
 */
public class SingletonHungerTest {

    //私有的构造方法 保证只能class自身调用
    private SingletonHungerTest() {

    }
    // 私有的 常量 保证 只有一个实例
    private static final SingletonHungerTest singletonHungerTest = new SingletonHungerTest();

    //静态方法返回 该类实例
    public static SingletonHungerTest getSingleton() {
        return singletonHungerTest;
    }


}

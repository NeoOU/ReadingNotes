package com.omed.singleton;

/**
 * Created by omed on 2016/11/16.
 * 线程安全的单例模式1--双重检查加锁模式（doulbe-checded locking）
 */
public class Singleton {
    //用volatile关键字，保证多线程下对Singleton的可见性
    private volatile static Singleton uniqueInstance;
    private Singleton(){}

    public static Singleton getInstance(){
        //双重检查加锁模式（doulbe-checded locking）
        if(uniqueInstance ==null){
            //对类加锁同步，则而不是实例对象
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

/**
 * 线程安全的单例模式2--同步getInstance方法
 */
class Singleton1{
    private static Singleton1 uniqueInstance = new Singleton1();
    private Singleton1(){}

    //能保证线程安全，但会影响程序性能
    public static synchronized Singleton1 getInstance(){
        if(uniqueInstance ==null){
            uniqueInstance= new Singleton1();
        }
        return uniqueInstance;
    }

}

/**
 * 线程安全的单例模式3--饥饿模式，在类加载时创建单例
 */
class Singleton2{
    //能保证线程安全，但会影响程序性能
    private static Singleton2 uniqueInstance = new Singleton2();
    private Singleton2(){}

    public static Singleton2 getInstance(){
        return uniqueInstance;
    }
}
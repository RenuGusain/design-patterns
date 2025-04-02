package com.renu.java.tutorial.design.pattern.creational.singleton;

/*
This is thread safe because the inner classes is loaded only
 when getInstance is called and jvm  synchronizes class loading internally
 */
class Singleton
{
    //private static final Singleton InstanceEager=new Singleton();

    private Singleton(){}
     private static class InstanceHelper
    {
        private static final Singleton Instance=new Singleton();

    }
    public static  Singleton getInstance()
    {
        return InstanceHelper.Instance;
    }
    public static void dosth()
    {
        System.out.println("I am singltone doing sth");

    }
}
public class SingletonUsingPrivateInnerClass {
    public static void main(String[] args) {

    }
}

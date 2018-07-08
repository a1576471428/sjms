package com.jrx.duckduck.base;

/**
 * @Author jrx
 * @Date 2018-07-08 9:25
 **/
public abstract class Duck {

    public void quack() {
        System.out.println("呱呱呱");
    }

    public void swim() {
        System.out.println("游啊游");
    }

    public abstract void display();
}

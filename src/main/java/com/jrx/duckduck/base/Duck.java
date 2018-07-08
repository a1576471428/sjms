package com.jrx.duckduck.base;

import com.jrx.duckduck.behavior.FlyBehavior;
import com.jrx.duckduck.behavior.impl.fly.FlyNoWay;

/**
 * @Author jrx
 * @Date 2018-07-08 9:25
 **/
public abstract class Duck {
    protected FlyBehavior flyBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public void fly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("游啊游");
    }

    public abstract void display();
}

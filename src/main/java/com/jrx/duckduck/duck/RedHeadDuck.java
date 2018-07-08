package com.jrx.duckduck.duck;

import com.jrx.duckduck.base.Duck;
import com.jrx.duckduck.behavior.impl.fly.FlyWithWings;

/**
 * @Author jrx
 * @Date 2018-07-08 9:30
 **/
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("红头鸭子");
    }
}

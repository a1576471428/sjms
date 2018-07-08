package com.jrx.duckduck.behavior.impl.fly;

import com.jrx.duckduck.behavior.FlyBehavior;

/**
 * @Author jrx
 * @Date 2018-07-08 9:49
 **/
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("不会飞");
    }
}

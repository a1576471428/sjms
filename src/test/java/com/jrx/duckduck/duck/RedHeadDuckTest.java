package com.jrx.duckduck.duck;

import com.jrx.duckduck.base.Duck;
import com.jrx.duckduck.behavior.impl.fly.FlyNoWay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author jrx
 * @Date 2018-07-08 10:01
 **/
class RedHeadDuckTest {

    @Test
    public void test(){
        Duck readHeadDuck = new RedHeadDuck();
        readHeadDuck.fly();
        readHeadDuck.setFlyBehavior(new FlyNoWay());
        readHeadDuck.fly();
    }

}
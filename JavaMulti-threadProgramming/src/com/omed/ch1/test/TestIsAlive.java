package com.omed.ch1.test;

import com.omed.ch1.service.IsAlive;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

/**
 * Created by xiaob_000 on 2016/10/16 0016.
 */
public class TestIsAlive {
    public static void main(String[] args)  throws Exception{
        IsAlive c = new IsAlive();
        c.setName("B");//在构造函数中的this.getName()为Thread-0
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        /*
         * 如果没有调用c.start().那么c的isAlive()状态不可能是true
         * t1.start()的输出中，this.isAlived(),可能为true,也可能为false.因为此时，c是否已经进入准备状态不可知
         */
        Thread.sleep(1000);
        c.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}


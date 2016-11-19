package com.omed.command.receiver;

/**
 * Created by omed on 2016/11/16.
 * 具体命令接收者
 */
public class ReceiverImpl implements Receiver {
    @Override
    public void action() {
        System.out.println("Receiver executes the action");
    }
}

package com.omed.command.test;

import com.omed.command.command.CommandImpl;
import com.omed.command.invoker.Invoker;
import com.omed.command.receiver.ReceiverImpl;

/**
 * Created by omed on 2016/11/16.
 * 测试命令模式
 */
public class Test {
    public static void main(String[] args) {
        CommandImpl command = new CommandImpl(new ReceiverImpl());


        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.invoke();

    }
}

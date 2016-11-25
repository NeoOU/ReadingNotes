package com.omed.command.invoker;

import com.omed.command.command.Command;

/**
 * Created by omed on 2016/11/16.
 * 命令模式中命令的调用者
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }

    public void invoikUndo(){
        command.undo();
    }
}

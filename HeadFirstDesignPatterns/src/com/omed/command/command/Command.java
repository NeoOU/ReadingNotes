package com.omed.command.command;

import com.omed.command.receiver.Receiver;

/**
 * Created by omed on 2016/11/16.
 * 命令模式中的命令
 */
public abstract class Command {
    protected Receiver receiver;

    public abstract void execute();

    public abstract void undo();

}

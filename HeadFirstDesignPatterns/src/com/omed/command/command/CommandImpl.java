package com.omed.command.command;

import com.omed.command.receiver.Receiver;

/**
 * Created by omed on 2016/11/16.
 * 具体命令
 */
public class CommandImpl extends Command {
    public CommandImpl(Receiver rec) {
        receiver=rec;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

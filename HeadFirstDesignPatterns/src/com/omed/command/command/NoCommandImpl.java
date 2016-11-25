package com.omed.command.command;

import com.omed.command.receiver.Receiver;

/**
 * Created by omed on 2016/11/25.
 * 空命令对象  当不想返回一个有意义对象时就可以返回一个空对象。便可以把处理null的责任交给这个空对象
 */
public class NoCommandImpl extends Command {

    public NoCommandImpl(Receiver re) {
        receiver=re;
    }

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}

package com.omed.ch3.entities;

public class  ThreadLocalExt<Integer> extends ThreadLocal<java.lang.Integer> {
    @Override
    protected java.lang.Integer initialValue() {
        return 0;
    }
}

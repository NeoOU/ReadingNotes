package com.omed.decorator.component;

/**
 * Created by omed on 2016/11/5.
 * 装饰者模式中的基础组件,用于被实例组件和抽象装饰器继承
 * 这个基础组件也可以是接口。
 */
public abstract class Component {
    protected String description="description";

    public abstract String getDescription();

    public abstract String method();
}

package com.omed.decorator.decorator;

import com.omed.decorator.component.Component;

/**
 * Created by omed on 2016/11/5.
 * 装饰者模式中的抽象装饰器
 * 继承基础组件用来获得“类型匹配”，而不是用来“继承行为”
 */
public abstract class Decorator extends Component{

    /**
     * 装饰器执有被装饰者的引用，以获得被装饰者的属性，被装饰者可能是组件，也可能是另一个装饰器
     */
    protected Component component;

}

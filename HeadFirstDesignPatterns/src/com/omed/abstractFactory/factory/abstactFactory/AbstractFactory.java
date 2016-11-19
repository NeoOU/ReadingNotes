package com.omed.abstractFactory.factory.abstactFactory;

import com.omed.abstractFactory.product.abstractFactory.AbstractProduct1;
import com.omed.abstractFactory.product.abstractFactory.AbstractProduct2;

/**
 * Created by omed on 2016/11/9.
 * 抽象工厂，用来定义要生产的产品家族，家族成员是一系列的东西
 *
 * 如果有通用的“机制”需要实现也可以设计成抽象类。但是抽象工厂一般只负责生产对象，而没有业务逻辑
 */
public interface AbstractFactory {
    AbstractProduct1 createAbstractProduct1();
    AbstractProduct2 createAbstractProduct2();
}

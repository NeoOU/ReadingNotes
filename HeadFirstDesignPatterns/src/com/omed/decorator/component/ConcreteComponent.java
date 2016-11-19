package com.omed.decorator.component;

/**
 * Created by omed on 2016/11/5.
 * 具体业务组件，可以单独使用，也可以被装饰器装饰。
 */
public class ConcreteComponent extends Component {

    public void setDecription(String dec) {
        description=dec;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String method() {
        return "I'm ConcreteComponent";
    }
}

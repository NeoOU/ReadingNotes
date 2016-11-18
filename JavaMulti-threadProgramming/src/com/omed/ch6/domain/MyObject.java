package com.omed.ch6.domain;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {

	private static final long serialVersionUID = -5343169150628691702L;
	private volatile static MyObject myObject;

	private MyObject() {
    }

	// 使用双检测机制来解决问题
	// 即保证了不需要同步代码的异步
	// 又保证了单例的效果
	public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				// 模拟在创建对象之前做一些准备性的工作
				Thread.sleep(3000);
				synchronized (MyObject.class) {
					if (myObject == null) {
						myObject = new MyObject();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
	// 此版本的代码称为：
	// 双重检查Double-Check Locking


	/**
	 * 反序列化时用于保证是原来的实例，而不会是另一个对象
	 * @return
	 * @throws ObjectStreamException
	 */
	protected Object readResolve() throws ObjectStreamException {
		System.out.println("调用了readResolve方法！");
		return myObject;
	}

}
package com.mockito.bean;

import com.mockito.dao.FooVoid;

public class BarVoid {
	private FooVoid foo;

	public BarVoid(FooVoid foo) {
		this.foo = foo;
	}

	public void bar(String parametr) {
		foo.foo(parametr);
	}
}

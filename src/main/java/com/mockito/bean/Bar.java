package com.mockito.bean;

import com.mockito.dao.Foo;

public class Bar {
	private Foo foo;

	public Bar(Foo foo) {
		this.foo = foo;
	}

	public String bar(String parametr) {
		foo.foo(parametr);
		return foo.foo(parametr);
	}
}

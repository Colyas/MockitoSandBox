package com.mockito.app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.mockito.bean.Bar;
import com.mockito.dao.Foo;

public class MockitoTestSetup {
	private Foo foo;
	private Bar bar;
	
	@Before
	public void init(){
		foo = Mockito.mock(Foo.class);
		bar = new Bar(foo);
	}

	@Test
	public void test() {
		bar.bar("qwe");
		Mockito.verify(foo).foo("qwe");
	}
	
	@Test
	public void simpleMocking(){
		Foo foo = Mockito.mock(Foo.class);
		Bar bar = new Bar(foo);
		
		bar.bar("qwe");
		Mockito.verify(foo).foo("qwe");
	}
	
	@Test
	public void stubParametr(){
		Foo foo = Mockito.mock(Foo.class);
		Bar bar = new Bar(foo);
		
		Mockito.when(foo.foo("qwe")).thenReturn("asd");//this
		Mockito.stub(foo.foo("qwe")).toReturn("asd");  //or this
		Mockito.doReturn("asd").when(foo).foo("qwe");  //or this
		
		assertEquals("asd", bar.bar("qwe"));
	}
}

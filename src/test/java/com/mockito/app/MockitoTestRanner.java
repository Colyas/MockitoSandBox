package com.mockito.app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.mockito.bean.Bar;
import com.mockito.dao.Foo;

public class MockitoTestRanner {
	
	@Mock
	private Foo foo;
	
	@InjectMocks
	private Bar bar = new Bar(null);
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test(){		
		Mockito.verify(foo).foo("qwe");
	}
}

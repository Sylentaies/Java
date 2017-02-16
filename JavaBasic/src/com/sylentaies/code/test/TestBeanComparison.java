package com.sylentaies.code.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sylentaies.code.BeanA;

public class TestBeanComparison {

	@Test
	public void testComparable() {
		List<BeanA> list = new ArrayList<>();
		list.add(new BeanA(5));
		list.add(new BeanA(7));
		list.add(new BeanA(3));
		assertEquals(5,	list.get(0).getX());
		assertEquals(7, list.get(1).getX());
		
		
		
	}

}

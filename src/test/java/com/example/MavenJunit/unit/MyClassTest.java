package com.example.MavenJunit.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.MavenJunit.MyClass;

import junit.framework.Assert;

public class MyClassTest {

	@Test
	public void test() {
		MyClass myclass = new MyClass();
		
		myclass.setId(5);
		myclass.setSecret(2);
		myclass.setName("Secret Key");
		
		Assert.assertEquals(myclass.calculatkey().intValue(), 10);
	}

}

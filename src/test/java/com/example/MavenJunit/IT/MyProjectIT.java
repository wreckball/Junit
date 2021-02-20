package com.example.MavenJunit.IT;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.example.MavenJunit.Lock;
import com.example.MavenJunit.MyClass;

import junit.framework.Assert;

public class MyProjectIT {

	@Test
	public void test() {
		MyClass myclass = new MyClass();
		
		myclass.setId(5);
		myclass.setSecret(2);
		myclass.setName("Secret Key");
		
		Assert.assertEquals(myclass.calculatkey().intValue(), 10);
		
		Lock lock = new Lock(10);
		
		Assert.assertEquals(true, lock.islocked());
		
		Assert.assertEquals(true, lock.unlock(10));
		Assert.assertEquals(false, lock.islocked());
		
		lock.lock();
		Assert.assertEquals(true, lock.islocked());
		
		Assert.assertEquals(false, lock.unlock(1));
		Assert.assertEquals(true, lock.islocked());
	}

}

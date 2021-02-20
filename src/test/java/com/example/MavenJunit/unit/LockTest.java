package com.example.MavenJunit.unit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.MavenJunit.Lock;

import junit.framework.Assert;

public class LockTest {

	@Test
	public void test() {
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

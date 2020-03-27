/**
 * 
 */
package com.framework.executor.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author surendrane
 *
 */
public class FirstUnitTest {

	@Test
	public void whenThis_thenThat() throws InterruptedException {
		System.out.println("First");
		Thread.sleep(6000);
		assertTrue(true);
	}

	@Test
	public void whenSomething_thenSomething() throws InterruptedException {
		System.out.println("Second");
		Thread.sleep(6000);
		assertTrue(true);
	}

	@Test
	public void whenSomethingElse_thenSomethingElse() throws InterruptedException {
		System.out.println("Thrid");
		Thread.sleep(6000);
		assertTrue(false);
	}
}

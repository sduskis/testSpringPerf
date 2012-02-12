package org.skyscreamer.testSpringPerf;

import org.junit.Ignore;
import org.junit.Test;

public abstract class AbstractIoCPerfTest {

	public void doTest(){
		testPojo5times();
	}
	
	@Test
	public void testPojo() {
		long start = System.currentTimeMillis();
		getBean();
		System.out.println(getClass().getName() + " Bean took " + (System.currentTimeMillis() - start) + " ms.");
	}

	protected abstract void getBean();

	@Test
	public void testPojoAgain() {
		testPojo();
	}

	@Test
	public void testPojo5times() {
		for (int i = 0; i < 5; i++) {
			testPojo();
		}
	}

	@Test
	@Ignore
	public void testPojo50times() {
		for (int i = 0; i < 50; i++) {
			testPojo();
		}
	}

	@Test
	@Ignore
	public void testPojoAnother50times() {
		testPojo50times();
	}

	@Test
	@Ignore
	public void testPojoYetAnother50times() {
		testPojo50times();
	}

	@Test
	@Ignore
	public void testPojoYetOneMore50times() {
		testPojo50times();
	}
	
	@Test
	@Ignore
	public void testForeverBwahahaha(){
		while(true){
			testPojo();
		}
	}
}

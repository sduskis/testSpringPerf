package org.skyscreamer.testSpringPerf;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;

public abstract class AbstractTestSpringPerf {

	@Before
	public void cleanup() {
		System.gc();
	}

	@Test
	public void testPojo() {
		ConfigurableApplicationContext ctx = createContext();
		ctx.getBean("nodeBean100");
		ctx.close();
	}

	protected abstract ConfigurableApplicationContext createContext();

	@Test
	@Ignore
	public void testPojoAgain() {
		testPojo();
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
}

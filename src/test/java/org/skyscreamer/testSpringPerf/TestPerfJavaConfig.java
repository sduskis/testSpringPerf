package org.skyscreamer.testSpringPerf;

import org.skyscreamer.testSpringPerf.javaconfig.PerfAppContextConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerfJavaConfig extends AbstractTestSpringPerf {

	@Override
	protected ConfigurableApplicationContext createContext() {
		return new AnnotationConfigApplicationContext(PerfAppContextConfiguration.class);
	}

	public static void main(String[] args) {
		new TestPerfJavaConfig().doTest();
	}
}

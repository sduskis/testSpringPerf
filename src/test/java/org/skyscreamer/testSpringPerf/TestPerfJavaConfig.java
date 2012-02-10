package org.skyscreamer.testSpringPerf;

import org.skyscreamer.testSpringPerf.javaconfig.PerfAppContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerfJavaConfig extends AbstractTestSpringPerf {

	@Override
	protected ConfigurableApplicationContext createContext() {
		return new AnnotationConfigApplicationContext(PerfAppContext.class);
	}

}

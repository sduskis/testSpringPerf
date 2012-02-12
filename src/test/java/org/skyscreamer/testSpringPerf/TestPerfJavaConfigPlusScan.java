package org.skyscreamer.testSpringPerf;

import org.skyscreamer.testSpringPerf.javaconfig.PerfComponentScanConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerfJavaConfigPlusScan extends AbstractTestSpringPerf {

	@Override
	protected ConfigurableApplicationContext createContext() {
		return new AnnotationConfigApplicationContext(PerfComponentScanConfiguration.class);
	}

}

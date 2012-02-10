package org.skyscreamer.testSpringPerf;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public abstract class AbstractTestXmlSpringPerf extends AbstractTestSpringPerf {

	protected ConfigurableApplicationContext createContext() {
		return new GenericXmlApplicationContext(getContextName());
	}

	abstract String getContextName();
}

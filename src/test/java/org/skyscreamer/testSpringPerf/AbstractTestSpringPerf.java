package org.skyscreamer.testSpringPerf;

import org.springframework.context.ConfigurableApplicationContext;

public abstract class AbstractTestSpringPerf extends AbstractIoCPerfTest {

	@Override
	protected void getBean() {
		ConfigurableApplicationContext ctx = createContext();
		ctx.getBean("nodeBean100");
		ctx.close();
	}

	protected abstract ConfigurableApplicationContext createContext();

}

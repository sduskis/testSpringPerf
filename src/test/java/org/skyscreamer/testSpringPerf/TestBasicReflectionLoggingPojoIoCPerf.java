package org.skyscreamer.testSpringPerf;

import org.skyscreamer.testSpringPerf.core.LoggingBasicBeanCreator;

public class TestBasicReflectionLoggingPojoIoCPerf extends AbstractIoCPerfTest {

	@Override
	protected void getBean() {
		new LoggingBasicBeanCreator().map.get("nodeBean100");
	}

	public static void main(String[] args) {
		new TestBasicReflectionLoggingPojoIoCPerf().testPojo();
	}
}

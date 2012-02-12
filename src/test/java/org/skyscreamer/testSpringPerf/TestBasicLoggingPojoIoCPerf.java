package org.skyscreamer.testSpringPerf;

import org.skyscreamer.testSpringPerf.core.LoggingReflectionBeanCreator;

public class TestBasicLoggingPojoIoCPerf extends AbstractIoCPerfTest {

	@Override
	protected void getBean() {
		new LoggingReflectionBeanCreator().map.get("nodeBean100");
	}

	public static void main(String[] args) {
		new TestBasicLoggingPojoIoCPerf().testPojo();
	}
}

package org.skyscreamer.testSpringPerf;

import org.skyscreamer.testSpringPerf.core.BasicBeanCreator;

public class TestBasicPojoIoCPerf extends AbstractIoCPerfTest {

	@Override
	protected void getBean() {
		new BasicBeanCreator().map.get("nodeBean100");
	}

	public static void main(String[] args) {
		new TestBasicPojoIoCPerf().testPojo();
	}
}

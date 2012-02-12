package org.skyscreamer.testSpringPerf;

public class TestPerfPojoP extends AbstractTestXmlSpringPerf {

	@Override
	String getContextName() {
		return "applicationContext.p.xml";
	}

	public static void main(String[] args) {
		new TestPerfPojoP().testPojo();
	}

}

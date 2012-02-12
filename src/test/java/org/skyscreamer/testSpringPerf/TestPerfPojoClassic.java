package org.skyscreamer.testSpringPerf;

public class TestPerfPojoClassic extends AbstractTestXmlSpringPerf {

	@Override
	String getContextName() {
		return "applicationContext1.xml";
	}

	public static void main(String[] args) {
		new TestPerfPojoP().testPojo5times();
	}

}

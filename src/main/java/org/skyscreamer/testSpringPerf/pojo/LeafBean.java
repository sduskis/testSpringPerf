package org.skyscreamer.testSpringPerf.pojo;

public class LeafBean {

	private String someValue;

	public LeafBean() {

	}

	public LeafBean(String someValue) {
		super();
		this.someValue = someValue;
	}

	public void setSomeValue(String someValue) {
		this.someValue = someValue;
	}

	public String getSomeValue() {
		return someValue;
	}

}

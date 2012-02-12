package org.skyscreamer.testSpringPerf.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectionBeanCreator {
	public Map<String, Object> map = new HashMap<String, Object>();

	public ReflectionBeanCreator() {
		init();
	}

	public void init() {
		createBeans();
		hookupBeans();
	}

	protected void createBeans() {
		add("leafBean", "org.skyscreamer.testSpringPerf.pojo.LeafBean");
		for(int i=1; i<=100; i++){
			add("nodeBean" + i, "org.skyscreamer.testSpringPerf.pojo.NodeBean" + i);
		}
	}

	private void add(String name, String className) {
		try {
			map.put(name, Class.forName(className).newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void hookupBeans() {
		hookup("nodeBean1", "leafBean", "setLeafBean");
		for(int i=2; i<=100;i++){
			if(i % 3 != 0){
				hookup("nodeBean" + i, "nodeBean" + (i-1), "setNodeBean" + (i-1));
			}
		}
	}

	private void hookup(String topBeanName, String dependencyName, String methodName) {
		Object topBean = map.get(topBeanName);
		Object dependency = map.get(dependencyName);
		try {
			Method method = topBean.getClass().getMethod(methodName, dependency.getClass());
			method.invoke(topBean, dependency);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

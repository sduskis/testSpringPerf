package org.skyscreamer.testSpringPerf.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class LoggingReflectionBeanCreator extends ReflectionBeanCreator {

	static Log log = LogFactory.getLog(LoggingReflectionBeanCreator.class);
	
	@Override
	protected void createBeans() {
		log.info("creating Beans");
		super.createBeans();
		log.info("created Beans");
	}
	
	@Override
	protected void hookupBeans() {
		log.info("bean hookup commencing");
		super.hookupBeans();
		log.info("beans hookedup successfully");
	}
}

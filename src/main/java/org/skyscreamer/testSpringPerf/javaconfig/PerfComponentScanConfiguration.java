package org.skyscreamer.testSpringPerf.javaconfig;

import org.skyscreamer.testSpringPerf.annotation.LeafBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.skyscreamer.testSpringPerf.annotation")
public class PerfComponentScanConfiguration {

	@Bean
	public LeafBean leafBean(){
		LeafBean leafBean = new LeafBean();
		leafBean.setSomeValue("someValue");
		return leafBean;
	}
}

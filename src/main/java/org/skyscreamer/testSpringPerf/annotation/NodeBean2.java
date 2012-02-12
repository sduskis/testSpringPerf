package org.skyscreamer.testSpringPerf.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NodeBean2 {

	@Autowired
	NodeBean1 nodeBean1;
}

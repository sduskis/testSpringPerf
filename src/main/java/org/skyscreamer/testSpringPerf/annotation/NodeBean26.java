package org.skyscreamer.testSpringPerf.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NodeBean26 {

	@Autowired
	NodeBean25 nodeBean25;
}

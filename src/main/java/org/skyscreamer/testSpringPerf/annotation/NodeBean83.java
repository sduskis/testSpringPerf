package org.skyscreamer.testSpringPerf.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NodeBean83 {

	@Autowired
	NodeBean82 nodeBean82;
}

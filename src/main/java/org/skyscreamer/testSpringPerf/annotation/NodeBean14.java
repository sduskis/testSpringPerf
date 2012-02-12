package org.skyscreamer.testSpringPerf.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NodeBean14 {

	@Autowired
	NodeBean13 nodeBean13;
}

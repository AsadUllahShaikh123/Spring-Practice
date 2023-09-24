package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

	@Value("#{2+3}")
	private int sum;
	@Value("#{4 * 4 }")
	private int multiply;
	@Value("#{ 5-2 }")
	private int sub;
	@Value("#{ 1 == 1 } ")
	private boolean equal;
	@Override
	public String toString() {
		return "Calculator [sum=" + sum + ", multiply=" + multiply + ", sub=" + sub + ", equal=" + equal + "]";
	}
	
	
}

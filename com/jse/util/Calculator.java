package com.jse.util;

import lombok.Data;

@Data
public class Calculator {
	private int num1, num2;
	
	public int calculate() {
		return num1 + num2;
	}
}

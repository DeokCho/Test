package com.jse.phone;

import lombok.Data;

@Data
public class PhoneServiceImpl {
	private Phone[] phones;
	private int count;
	public PhoneServiceImpl() {
		phones = new Phone[3];
		count = 0;
	}
	
	public void add(Phone phone) {
	phones[count] = phone;
	count++;
	}
}

package com.jse.algorithm;

import javax.swing.JOptionPane;

public class Sum1To5 {
	public static void main(String[] args) {
		int sum =0;
		for(int i=0; i<10; i++) {
			System.out.println(i);
			sum +=i;
		}
		JOptionPane.showMessageDialog(null, "합: "+sum);
	}
}

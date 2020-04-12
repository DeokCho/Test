package com.jse.phone;

import javax.swing.JOptionPane;
import com.jse.util.Constants;

public class PhoneController {
	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.PHONE_MENU)){
				case "0": return;
				case "1": 
					for(int i=0; i<3; i++) {
						String[] value = JOptionPane.showInputDialog(Constants.PHONE_SELECT).split(",");
					}
					
					
			}
		}
	}
}

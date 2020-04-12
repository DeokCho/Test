package com.jse.phone;

import lombok.Data;

@Data
public class Phone {
	private String number,name,company;
	public Phone(String number,String name,String company) {
		this.number=number;
		this.name=name;
		this.company=company;
	}
	
	public String toString() {
		return "number : "+number +"name : "+name+"company :"+company;
	}
}

@Data
class CellPhone extends Phone{
	private String portable;
	
	public CellPhone(String number,String name, String company,  String portable) {
		super(number, name, company);
		this.portable=portable;
	}
	public String toString() {
		return super.toString() +"portable : "+portable;
	}
}
@Data
class Iphone extends CellPhone{
	private String search;
	public Iphone(String number,String name, String company,  String portable,String search) {
		super(number,name,company,portable);
		this.search=search;
	}
	public String toString() {
		return super.toString() +"search:"+search;
	}
}

class GallaxyNote extends Iphone{
	private String bigsize;
	public GallaxyNote(String number,String name, String company,  String portable,String search, String bigsize) {
		super(number,name,company,portable,bigsize);
		this.bigsize=bigsize;
	}
	public String toString() {
		return super.toString() +"bigsize:"+bigsize;
	}
}

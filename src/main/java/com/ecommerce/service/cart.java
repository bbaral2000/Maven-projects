package com.ecommerce.service;

import java.util.ArrayList;


public class cart {

	private int pid;
	private String name, desc, catagory;
	private int price;
	
	
	public cart(String cartStringObj)
	{
		this(cartStringObj.split(","));
	}
	
	public cart(String[] cartParam) {

		this.pid = Integer.parseInt(cartParam[0]);;
		this.name = cartParam[1];
		this.desc = cartParam[2];
		this.catagory = cartParam[3];
		this.price = Integer.parseInt(cartParam[4]);
	}
	
	public cart(int pid, String name, String desc, int price, String catagory) {

		this.pid = pid;
		this.name = name;
		this.desc = desc;
		this.catagory = catagory;
		this.price = price;
	}
	

	public cart() {
	
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "" + pid + "," + name + "," + desc
				+ "," + catagory + "," + price + "";
	}
	
	
}

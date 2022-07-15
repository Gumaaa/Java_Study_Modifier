package com.gm.himart;

import com.gm.himart.Unit;

public class Tv extends Unit {
	private int size;
	
	public Tv() {
		this.size = 100;
		this.setBrand("LG");
		this.setPrice(8000000);
		this.setPoint(200);
	}
	
	public void info() {
		super.info();
		System.out.println("Size: " + this.size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

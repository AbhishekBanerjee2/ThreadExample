package com.training.domains;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "innova";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "green";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100000.00D;
	}

}

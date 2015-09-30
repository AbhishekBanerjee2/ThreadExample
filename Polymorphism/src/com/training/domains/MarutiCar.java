package com.training.domains;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "supreme";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50000.0D;
	}

}

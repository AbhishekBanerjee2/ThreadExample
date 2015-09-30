package com.training.domains;

import com.training.ifaces.Automobile;

public class BajajBike implements Automobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Pulsaar";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 120000.00D;
	}

}

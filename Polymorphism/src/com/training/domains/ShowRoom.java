package com.training.domains;

import com.training.ifaces.Automobile;

public class ShowRoom 
{
	
	public Automobile getProduct(int key)
	{
		
		switch (key) {
		case 1:
			return new MarutiCar();
		case 2:
			return new ToyotaCar();
		default:
			return null;
		}
		
		
	}
	
	public void printQuote(Automobile auto)
	{
		System.out.println(auto.getModel());
		System.out.println(auto.getColor());
		System.out.println(auto.getPrice());
	}

}

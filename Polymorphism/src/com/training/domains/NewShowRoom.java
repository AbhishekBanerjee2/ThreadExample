package com.training.domains;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		
		if(key==3)
		{
			return new BajajBike();
		}
		else
		{
	       return super.getProduct(key);
	    }
	
	}
}
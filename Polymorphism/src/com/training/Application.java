package com.training;

import com.training.ifaces.*;
import com.training.domains.*;

public class Application {
	
	public static void main(String[] args)
	{
		int key=2;
		
		NewShowRoom obj= new NewShowRoom();
		
		
		Automobile auto = obj.getProduct(key);
		
		if(auto!=null)
		{
			obj.printQuote(auto);
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}

}

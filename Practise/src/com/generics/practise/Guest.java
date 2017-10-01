package com.generics.practise;

//<T extends Glass> 
public class Guest{

	//private T nowItIsUsed;
	
	public static void main(String[] args) {
		
		Glass<Juice> glass = new Glass<>();
		Juice juice = new Juice();
		
		glass.liquid = juice;
		
		Juice j = glass.liquid;
		if(glass instanceof Glass)
		System.out.println("Hello");
	}

}

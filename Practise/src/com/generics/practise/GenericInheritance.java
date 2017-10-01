package com.generics.practise;

public class GenericInheritance {

	public GenericInheritance() {

	}

	public static void main(String[] args) {
		Box<Integer> ob = new  Box<Integer>(10);
		ob.print();
	}
}
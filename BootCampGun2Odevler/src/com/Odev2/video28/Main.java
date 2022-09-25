package com.Odev2.video28;

public class Main {
	//Bir class nasil calisir
	public static void main(String[] args) {
		
		CustomerManager customerManager= new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();

	}

}
package com.Odev2.video36;

public class Main {
	//Inheritance yapisini anlamak
	public static void main(String[] args) {
		Customer customer=new Customer();
		Employee employee=new Employee();
		
		EmployeeManager employeeManager= new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
		employeeManager.BestEmployee();
		
	}

}

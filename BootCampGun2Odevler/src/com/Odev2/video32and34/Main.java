package com.Odev2.video32and34;

public class Main {
	// Encapsulation ihtiyacini anlamak
	//getter,setter,constructor ile calismak
	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		//product.set_name("Laptop");
		//product.set_id(1);
		//product.set_description("Asus Laptop");
		//product.set_price(5000);
		//product.set_stockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.get_kod());
	}

}

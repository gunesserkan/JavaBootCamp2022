package com.Odev2.video31;

public class Main {
	//Field ve attribute ile calismak
	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Laptop";
		product.id=1;
		product.description="Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
		
		ProductManager productManager=new ProductManager();
		productManager.add(product);
	}

}
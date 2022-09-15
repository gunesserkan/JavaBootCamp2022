package com.odev2.video9;

public class Main {
	//GIRILEN 3 SAYIDAN EN BUYUGUNU BULAN PROGRAM
	public static void main(String[] args) {
		
			int sayi1 = 266;
			int sayi2 = 25;
			int sayi3 = 26;
			int enBuyuk= sayi1;
			
			if(enBuyuk<sayi2) {
				enBuyuk=sayi2;
			}
			if(enBuyuk<sayi3) {
				enBuyuk=sayi3;
			}
			
			
			System.out.println("En büyük sayı : "+enBuyuk);

	}

}

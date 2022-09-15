package com.odev2.video10;

public class Main {
	//SWITCH-CASE YAPISI KULLANIMI ORNEK UYGULAMA
	public static void main(String[] args) {
		
			char grade = 'A';
			
			switch (grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok güzel : Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değil : Geçtiniz");
				break;
			case 'F':
				System.out.println("Malesef Kaldınız");
				break;
			default:
				throw new IllegalArgumentException("Geçersiz not girdiniz");
			}
			
	}

}

package intro;

public class Main {

	public static void main(String[] args) {
	    
		System.out.println("Hello World!");
		
		
		
		String ortaMetin ="İlginizi çekebilir";
		String altMaetin = "Vade  süresi";
		System.out.println(ortaMetin);
		
		double dolarDun=18.14;
		double dolarBugun=18.10;
		
		boolean dolarDustuMu=false;
		
		String okYonu= "";
		
		if(dolarDun<dolarBugun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		}
		else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler= {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}

package oopWithNLayeredApp.core.logging;

public class FileLOgger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : "+data);
		
	}

}

package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLOgger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
			
		Product product1 = new Product(1,"Iphone Xr",9000);
		
		Logger[] loggers= {new DatabaseLogger(),new FileLOgger(),new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
	}

}
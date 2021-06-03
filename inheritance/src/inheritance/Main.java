package inheritance; //miras

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer mehmet =new IndividualCustomer();
		 mehmet.customerNumber="123";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="456";
		
		CustomerManager customerManager= new CustomerManager();
		//customerManager.add(mehmet);
		//customerManager.add(hepsiBurada);
		
		// polimorfizm örneði: farklý müþteri türlerini tek bir sýnýftan çaðýrdýk..!
		Customer[] customers= {mehmet, hepsiBurada};
		customerManager.addMultiple(customers);
		
		
		
		
	}

}

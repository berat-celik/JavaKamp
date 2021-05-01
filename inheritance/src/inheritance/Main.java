package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer berat = new IndividualCustomer();
		berat.customerNumber ="12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "123456789";
		
		CustomerManager customerManager = new CustomerManager();
	//	customerManager.add(hepsiBurada);
	//	customerManager.add(berat);
		
		Customer[] customers = {berat,hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		
		
		
		
		
		
		
		

	}

}



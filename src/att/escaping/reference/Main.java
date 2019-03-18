package att.escaping.reference;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
//		records.getCustomers().put("Long", new Customer("Long"));
		//records.addCustomer(new Customer("Long"));
		
		for (Customer next : records.getCustomers().values()) {
			System.out.println(next);
		}

		Map<String, Customer> map = records.getCustomers();
		map.put("Long", new Customer("Long"));
		for (Map.Entry<String, Customer> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		System.out.println("======");
		for (Customer next : records.getCustomers().values()) {
			System.out.println(next);
		}
	}

}

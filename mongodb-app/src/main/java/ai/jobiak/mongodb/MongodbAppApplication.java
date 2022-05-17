package ai.jobiak.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbAppApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MongodbAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Customer c1 = new Customer("101","Sandeep","Kumar");
		Customer c2 = new Customer("102","Mouli","Kumar");
		Customer c3 = new Customer("103","Vishnu","Vardhan");
		Customer c4 = new Customer("104","Ronie","Kishan");
		Customer c5 = new Customer("105","Sonie","Saladi");
		
		customerRepository.save(c1);
		customerRepository.save(c2);
		customerRepository.save(c3);
		customerRepository.save(c4);
		customerRepository.save(c5);
		
		System.out.println("------------------");
		
		List<Customer> customers = customerRepository.findAll();
		
		for(Customer c : customers) {			
			System.out.println(c);
		}
				
	}

}

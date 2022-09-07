import java.util.ArrayList;
import java.util.Scanner;

public class CodingChallenge
{
	private static final String INVALID_INPUT_MESSAGE = "\nInvalid input!";
	
	public static void main(String[] args)
	{
		// Create the array list of customers and add some hard-coded customers
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Alice", 20));
		customers.add(new Customer("Bob", 25));
		customers.add(new Customer("Carol", 30));
		customers.add(new Customer("Dave", 35));
		
		// Output all of the customers
		
		System.out.println("\nCUSTOMERS");
		
		for (Customer cust : customers)
		{
			int index = customers.indexOf(cust) + 1;
			System.out.println("Customer " + index + ": " + cust.getName() + ", " + cust.getAge());
		}
		
		// Output the average age, the oldest customer and the youngest customer
		
		System.out.println("\nCUSTOMER AGES");
		System.out.println("Average age: " + calculateAverageAge(customers));
		System.out.println("Oldest customer: " + findOldestCustomer(customers).getName());
		System.out.println("Youngest customer: " + findYoungestCustomer(customers).getName());
		
		// Let the user enter the number for a customer, and retrieve that customer
		
		while (true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("\nEnter a customer's number to find out more details: ");
			int input = scanner.nextInt();
			
			// Some basic validation
			// Also worth ensuring that the input is an integer e.g. not a String
			if (input <= customers.size() && input >= 1)
			{
				Customer cust = customers.get(input - 1);
			
				// Output the customer's details
				// This could be more relevant when there is more info stored on customers
				System.out.println("\nCUSTOMER " + input);
				System.out.println("Name: " + cust.getName());
				System.out.println("Age: " + cust.getAge());
			}
			else
			{
				System.out.println(INVALID_INPUT_MESSAGE);
			}
		}
	}
	
	private static float calculateAverageAge(ArrayList<Customer> customers)
	{
		float total = 0;
		
		for (Customer cust : customers)
		{
			total += cust.getAge();
		}
		
		float averageAge = total / customers.size();
		return averageAge;
	}
	
	private static Customer findOldestCustomer(ArrayList<Customer> customers)
	{
		int oldestAge = 0;
		Customer oldestCustomer = new Customer("", 0);
		
		for (Customer cust : customers)
		{
			if (cust.getAge() > oldestAge)
			{
				oldestCustomer = cust;
				oldestAge = cust.getAge();
			}
		}
		
		return oldestCustomer;
	}
	
	private static Customer findYoungestCustomer(ArrayList<Customer> customers)
	{
		int youngestAge = Integer.MAX_VALUE;
		Customer youngestCustomer = new Customer("", 0);
		
		for (Customer cust : customers)
		{
			if (cust.getAge() < youngestAge)
			{
				youngestCustomer = cust;
				youngestAge = cust.getAge();
			}
		}
		
		return youngestCustomer;
	}
}
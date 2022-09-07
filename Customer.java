public class Customer
{
	private String name;
	private int age;
		
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	// Not currently required but likely to be useful in the future
	public void setName(String name)
	{
		this.name = name;
 	}
	
	public int getAge()
	{
		return this.age;
	}
	
	// Not currently required but likely to be useful in the future
	public void setAge(int age)
	{
		this.age = age;
 	}
	
	// Might be useful to have a method which prints all of a customer's details
	public void print()
	{
	}
}
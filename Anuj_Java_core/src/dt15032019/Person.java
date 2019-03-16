package dt15032019;

public class Person {

protected String name;
protected String address;

public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}





public String toString()
{
	return name +" , "+address;
}



public void getEmployeeDetails()
{
	System.out.println(name +" ,  "+address);
}





	
	
}

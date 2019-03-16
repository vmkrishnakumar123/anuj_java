package dt16032019;

public class Person {

protected String name;
protected String address;

int x =10;

public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
	
	System.out.println("Person class constructor is called");
}





public String toString()
{
	return name +" , "+address;
}



public void getPersonDetails()
{
	System.out.println(name +" ,  "+address);
}





	
	
}

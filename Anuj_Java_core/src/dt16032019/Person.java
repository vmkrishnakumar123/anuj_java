package dt16032019;

public class Person {

protected String name;
protected String address;

final int X=10;

public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
	//x= x+10;
	System.out.println("Person class constructor is called");
}





public String toString()
{
	return name +" , "+address;
}


public final void display()
{
	System.out.println("Super class implementation");
}



public void getPersonDetails()
{
	System.out.println(name +" ,  "+address);
}





	
	
}

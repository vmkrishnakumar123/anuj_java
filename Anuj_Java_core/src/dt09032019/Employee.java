package dt09032019;
/*
 * Access Modifiers
 * private 
 * public  - class
 * Protected
 * Package(default)  -class
 * 
 * Non Access Modifier
 */
public  class Employee {
	
	// properties/ attribute/instance variables
	
	   int eid;
	   String name;
	   double salary;
	   String mobile;
	   
	   
	   public Employee()
	   {
		 eid =12;
		 name = "Krishna";
		 salary = 30000.00;
		 mobile ="8500493754";
	   }
	   
	   
	   
	   
	   
	   public void displayEmployee()
	   {
		   System.out.println(eid+" , "+name+" , "+salary+" , "+mobile);
	   }
	   



}

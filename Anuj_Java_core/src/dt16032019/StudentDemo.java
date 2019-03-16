package dt16032019;

public class StudentDemo {

	public static void main(String[] args) {

  Person p = new Person("krishna", "hyd");
  
  p.getPersonDetails(); // method call 
  
		
		System.out.println("***********************************************");
		
		
		
		Student s = new Student("krishna", "Hyd", 123);
		s.showResult();
		s.getPersonDetails();  // method call
	
		
		System.out.println("**************************************");
		MgtQuotaStudent mgt = new MgtQuotaStudent("krishna", "Hyd", 123, 4000000.00);
		
		
		mgt.showResult();
		mgt.getPersonDetails();  // method call
		
		
		
		
		
		
		
		System.out.println("********************************************");
		
		
		int a=10;
		double x =10.0;
		x=10;
		
		
		Person p1 ;
		//p1 = new Employee();
		p1 = new Person("krishna","hyd");
		p1.getPersonDetails();
		
		
       p1 = new Student("krishna", "Hyd", 123);
       p1.getPersonDetails();
       
       
	}

}

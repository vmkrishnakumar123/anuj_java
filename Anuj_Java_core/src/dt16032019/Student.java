package dt16032019;

public  class Student extends Person {
	protected int roll;
	
int x =40;
	public Student(String name, String address, int roll) {
		
   super(name,address);

		
		this.roll = roll;
		
		
		
		System.out.println("Student class constructor is called ");
		
		
		
	}

	
	
	
	public void showResult()
	{
		System.out.println("This is result method");
	}
	
	
	

	//
	//public void getPersonDetails()
	
	@Override
	public void getPersonDetails()
	{
		
		super.getPersonDetails();
		System.out.println(roll);
		
		System.out.println(super.X);
	}
	

	
	
	/*
	 * public void display() {
	 * 
	 * }
	 */
	

}

package dt21032019;

public class InterfaceDemo {

	public static void main(String[] args) {


		/*
		 * Teacher t = new Teacher(); t.speak();
		 */
		
		
		Speaker s;
		//s = new Speeaker();
		s= new Teacher();
		s.speak();
		//s.display();
		
		s = new Politician();
		s.speak();
		//s.display();
		
		//Speaker.display();
		
		
		
		
		
		
		
		
		
		
		
		Speaker s1 = new Speaker()
				{
			@Override
			public void speak()
			{
				System.out.println("anonymous implementation");
				
			}
				};
				
				s1.speak();
				
		
		
		

	}

}

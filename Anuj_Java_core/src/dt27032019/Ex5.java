package dt27032019;

public class Ex5 {

	public static void main(String[] args) {

      // id, name , age(18-100)-InvalidAgeException- User
		
		int id =10;
		String name="xyz";
		int age=14;
		
		if(age<18 || age>100)
		{
			InvalidAgeEexeption iae = new InvalidAgeEexeption("Age is not in range");
			throw iae;
			
		}
		else
		{
			User u = new User(id,name,age);
			System.out.println(u);
		}
		

	}

}

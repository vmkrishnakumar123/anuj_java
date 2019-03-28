package dt21032019;

public class LambdaExpresionExample {

	public static void main(String[] args) {

		
		Addition a1= new Addition()
				{

					@Override
					public int add(int a, int b) {
						// TODO Auto-generated method stub
						return 0;
					}
				
				};
		
		
		/*
		 * 
		 */

				Speaker s =()->{
					
					
					System.out.println("lambda");
				};
				s.speak();
				
		Addition ad =(a, b)->{
			
			
			return a+b;
			};
		
		int res =ad.add(30, 50);
		
		System.out.println(res);
			

	}

}

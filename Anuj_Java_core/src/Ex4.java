import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {


		
		
		Scanner  s = new Scanner(System.in);
        
        System.out.println("Emter Two Numbers");
        int a=s.nextInt();
        int b=s.nextInt();
       
        int c;
        
        try
        {
     	   c = div(a,b); //
     	   
     	   System.out.println("The Result is :"+c);
        }catch (ArithmeticException e) {

         System.out.println("devide by zero error");
         e.printStackTrace();
		}
		finally
		{
			s.close();
			System.out.println("With in finally Block");
		}
		
		
		

	}

	private static int div(int a, int b) {

         
		return a/b;
	}


	}



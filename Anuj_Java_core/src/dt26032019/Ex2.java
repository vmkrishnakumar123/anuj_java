package dt26032019;

import java.util.Scanner;

public class Ex2 {
	
	// try,catch, finally - throws and throw

	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Two  integers");
		  
		  
		  int a=sc.nextInt(); int b= sc.nextInt();
		 try
		 {
		  int c = a/b;
		  
		  System.out.println(c);
		 System.out.println("My name is :"+args[0]);
		 System.out.println(Integer.parseInt("abc"));
		 }catch (Exception e) {

System.out.println("devide by zero error");
		} /*
			 * catch (ArrayIndexOutOfBoundsException e) {
			 * 
			 * System.out.println("Please provide required input"); }
			 */


		
		

	}

}

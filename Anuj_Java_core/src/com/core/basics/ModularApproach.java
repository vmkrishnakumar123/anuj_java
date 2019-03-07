package com.core.basics;

import java.util.Scanner;

public class ModularApproach {
	
	/*
	 * input - integer
	 * output - integer - reverse integer
	 * return - any premetive(int,short,long,byte, float,double, char, boolean)
	 *        - any derived(String, Integer , StringBuilder, Employee,Student)
	 *        - void
	 */
	
	
	
	public static double boxVolueme(Box box)
	{

		
		double vol = box.getBreadth()* box.getHeight()*box.getWidth();
		return vol;
	}
	
	
	
	public    int reverse(int n)
	{
		int rev =0;
		int rem;
		
		while(n!=0)
		{
			rem = n%10;
			rev = (rev*10)+rem;
			n= n/10;
		}
		
	return rev;
	}
	
	public static void main(String[] args) {
		
		
		/*
		 * ModularApproach ma = new ModularApproach(); int input;
		 */
   		Scanner sc = new Scanner(System.in);
   		System.out.println("Enter b,h,d ");
   		
   		double b,d,h;
   		b=sc.nextDouble();
   		h=sc.nextDouble();
   		d=sc.nextDouble();
   		
   		Box box = new Box(h, d, b);
   		
   		double v=boxVolueme(box);
   		System.out.println(v);
   		
   		
		/*
		 * String s =sc.nextLine();
		 * 
		 * String[] tokens=findTokens(s);
		 * 
		 * for(String t:tokens) { System.out.println(t); }
		 */
   		
   		// java, is object oriented programming
   		
		/*
		 * int n=sc.nextInt();
		 * 
		 * int[] inputArray = new int[n];
		 * 
		 * 
		 * System.out.println("Enter The Array Elements"); for (int i = 0; i <
		 * inputArray.length; i++) { inputArray[i] = sc.nextInt();
		 * 
		 * }
		 * 
		 * 
		 * System.out.println("Enter Key to search"); int key=sc.nextInt();
		 * 
		 * boolean status =findKey(inputArray,key);
		 * 
		 * 
		 * System.out.println(status);
		 *///inputArray[5] = 45;
   		
   		
   		
   		
   		
   		
   		
   		
   		
		/*
		 * input=sc.nextInt(); int output =ma.reverse(input);
		 * System.out.println(output);
		 */		
		sc.close();
		
		
		
	}

	
	
	
	public static String[] findTokens(String s)
	{
		return s.split(" ");
	}
	private static boolean findKey(int[] inputArray, int key) {

   boolean status = false;
		
		for (int i = 0; i < inputArray.length; i++) {
			
			
			if(inputArray[i]==key)
			{
				status= true;
				break;
			}
			
			
		}
		return status;
	}

}

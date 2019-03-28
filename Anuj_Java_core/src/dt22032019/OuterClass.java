package dt22032019;

public class OuterClass {
	
	private static int x = 40;
	
	public void display()
	{
		int y=90;
		System.out.println("x in Outer class :"+x);
		
		
		class LocalInnerClass
		{
			public void localinnerdisplay()
			{
				System.out.println("X is "+x+"  , Y is "+y);
			}
		}
		
		LocalInnerClass lic = new LocalInnerClass();
		lic.localinnerdisplay();
		
		
	}
// member inner class
	static class InnerClass
	{
	public void innerDisplay()
	{
		System.out.println("x is :"+x);
	}
	}
	
}


class Example
{
	public void ex()
	{
		
		
		OuterClass oc = new OuterClass();
		oc.display();
		System.out.println(" is in Outer class");
	}
}
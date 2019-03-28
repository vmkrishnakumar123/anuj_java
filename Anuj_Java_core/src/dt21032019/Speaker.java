package dt21032019;


public interface Speaker {
	final int M=30;
	
	public abstract void speak();
	//public int add();
	
	public  default  void display()
	{
		System.out.println("Default implementation");
	}
	
	
	

}

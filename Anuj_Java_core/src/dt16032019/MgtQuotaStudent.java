package dt16032019;

public class MgtQuotaStudent   extends Student{
	
	private double donation;

	public MgtQuotaStudent(String name, String address, int roll, double donation) {
		super(name, address, roll);
		this.donation = donation;
		
		System.out.println("mgt student");
	}
	
	@Override
	public void getPersonDetails()
	{
		System.out.println(name +" ,  "+address+"  , "+roll+" , "+donation);
	}

}

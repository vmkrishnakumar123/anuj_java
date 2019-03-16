package dt08032019;

import dt09032019.Employee;
public class Demo {

	public static void main(String[] args) {

		 double a ;
		
		a=110;
		
       Shape shape ;  //
       shape= new Shape();
       //shape = new Triangle();
       
       Rectangle r = new Rectangle();
       shape.drawShape(r);//
       shape.drawShape(new Circle());
       
       
       Triangle t = new Triangle();
       
       shape.drawShape(t);
       
		
	Employee e = new Employee();	
		
		

	}

}

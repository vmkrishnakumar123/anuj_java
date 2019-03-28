package dt27032019;

import java.io.File;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {

            System.out.println(args[0]);// ->
		
            File f = new File("G://abc.txt");
            try
            {
            f.createNewFile(); 
            }catch (Exception e) {


			}
		

	}

}

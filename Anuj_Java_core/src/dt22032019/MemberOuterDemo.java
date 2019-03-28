package dt22032019;

import dt22032019.OuterClass.InnerClass;

public class MemberOuterDemo {

	public static void main(String[] args) {

    OuterClass oc = new OuterClass();
    oc.display();
    
		/*
		 * OuterClass.InnerClass ic = oc.new InnerClass(); ic.innerDisplay();
		 */
		
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.innerDisplay();

	}

}

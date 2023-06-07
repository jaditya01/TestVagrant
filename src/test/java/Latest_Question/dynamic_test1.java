package Latest_Question;

class static_Test1  {
	
	public static void m1(){
		System.out.println("parent m1");
	}
}


public class dynamic_test1 extends static_Test1{

	public static void main(String[] args) {

		/*
		 * public static void m1(){ System.out.println("child m1"); }
		 */

		dynamic_test1 dt = new dynamic_test1();
		dt.m1();

	}

}


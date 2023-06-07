package Latest_Question;

public class static_test {

	public static void main(String[] args) {

		static_test st = new static_test();    
      // st.m1();
       // st.m2();
       dynamic_test dt = new dynamic_test();
     //   dt.m1();
       dt.m2();
        dynamic_test.m1();
        
	}
	
	public static void m1() {
		System.out.println("i am m1");
	}

}

class dynamic_test extends static_test{
	
	public static void m2() {
		System.out.println("this is m2 ");
	}
	
	public static void m1() {
		System.out.println("i am m1 and m2");
	}
	
	
	
	
}
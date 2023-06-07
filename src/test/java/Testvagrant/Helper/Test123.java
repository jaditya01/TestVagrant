package Testvagrant.Helper;

public class Test123 {

	public static void main(String[] args) {



    String s= "IpL|7started||yesterday";


 s= s.replaceAll("[0-9/%#$]", " ");
  
 //s=  s.replaceAll("[/%#$]"," ");
  
  
//System.out.println(s);
  

  String p[]=  s.split("\\|");
  
  for(String as: p) {
 
  System.out.println(as);
  }
	}

}

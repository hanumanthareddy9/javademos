package InnerClasses;

public class innerClassAssisted1 {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us do magics with java");}  
	 }  


	public static void main(String[] args) {

		innerClassAssisted1 obj=new innerClassAssisted1();
		innerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}




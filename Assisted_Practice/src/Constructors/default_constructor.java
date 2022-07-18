package Constructors;

class EmpInfo{
	int id=583103;
	String name="raj";

void display() {
	System.out.println(id+" "+name);
	}
}

public class default_constructor {
	public static void main(String[] args) {

		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display();
		emp2.display();
		}


}

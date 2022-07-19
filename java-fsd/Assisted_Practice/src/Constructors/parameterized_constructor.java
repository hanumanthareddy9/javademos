package Constructors;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class parameterized_constructor {
	public static void main(String[] args) {

		Std std1=new Std(3,"hanumanth");
		Std std2=new Std(5,"ravi");
		std1.display();
		std2.display();
			}

}

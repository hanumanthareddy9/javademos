
public class method_demo {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		method_demo b=new method_demo();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}

}

package Arrays;

public class arrayAssisted {

public static void main(String[] args) {

//single-dimensional array
int a[]= {101,201,301,401,501};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {22, 44, 66, 88}, 
            {33, 66, 99} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}


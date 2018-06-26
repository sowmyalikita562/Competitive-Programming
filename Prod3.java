import java.util.*;

public class Prod3{
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if(n <= 2){
			System.out.println("Exceptional size");
			System.exit(0);
		}

		int[] arr = new int[n];
		System.out.println("Enter elements");
		for (int i=0;i<n ;i++ ) {
			arr[i]=Integer.parseInt(sc.next());
			
		}
		if(n==3){
			System.out.println("Product is "+ arr[0]*arr[1]*arr[2]);
			System.exit(0);
		}
		int prod = prod3(arr);
		System.out.println("Highest prod of 3 is :" + prod);
	}
	public static int prod3(int[] x){
		int r = x[0];
		int s = x[1];
		int temp=0;
		for (int i=2;i<x.length;i++ ) {
			if(Math.min(r,s)<x[i]){
				
				if(r>s){
					temp=s;
					s=x[i];
				}
				else{
					temp=r;
					r=x[i];
				}
			}
		}
		if(temp==0){
		  return r*s*x[2];
		}
     System.out.println(temp+"  r"+ r+ "  s"+ s);
     int l = temp * r*s;
     return l;

	}
}
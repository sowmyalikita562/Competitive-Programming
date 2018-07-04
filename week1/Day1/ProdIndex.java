import java.util.*;

public class ProdIndex{
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if(n < 2){
			System.out.println("Exceptional size");
		}
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for (int i=0;i<n ;i++ ) {
			arr[i]=Integer.parseInt(sc.next());
			
		}
		sumarr(arr);
	}
	public static void sumarr(int[] x){
		//Before elements into array
		int[] bef = new int[x.length];
		// int[] aft = new int[x.length];
		int product =1;
		bef[0]=1;
		for(int i=1;i<x.length;i++){
			product= product * x[i-1];
			bef[i] = product;
		}
		// System.out.println("printing array after first loop");
		// System.out.println(Arrays.toString(bef));
		//After elements of index
		product = 1;
		bef[x.length-1]= bef[x.length-1]*1;
		// aft[x.length-1]=1;
		for(int i=x.length-2;i>=0;i--){
			product = product * x[i+1];
			// aft[i] = product;
			bef[i] = bef[i]*product;
		}
		System.out.println("printing array after 2nd loop");
		System.out.println(Arrays.toString(bef));
	}
}
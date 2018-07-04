import java.io.*;
import java.util.*;

public class GFG {
    public static int count( int x[], int size, int amt )
	{
	
		if (amt == 0)
			return 1;
		if (amt < 0)
			return 0;
		if (size <=0 && amt >= 1)
			return 0;
		return count( x, size - 1, amt ) +
			count( x, size, amt-x[size-1] );
	}
	
	
	public static void main(String[] args)
	{
		int i, j;
		System.out.println("Enter the size of coin dimensions");
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		int arr[] = new int[n];
		System.out.println("Enter the elements ");
		for( i=0;i<n;i++){
			arr[i]=Integer.parseInt(sc.next());
		}
		System.out.println("Enter the amount to find");
		int amount = Integer.parseInt(sc.next());
		int ans=count(arr, n, amount);

		if(ans==0){
			System.out.println("Exception arised");
		}
		System.out.println("Ans is "+ ans);
		
		
	}

}

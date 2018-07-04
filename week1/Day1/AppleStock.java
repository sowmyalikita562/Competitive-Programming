/*The best price 1 function is the brute force method with quadratic complexity.Whereas the best price 2 is the usage of greedy method 
where the complexity is reduced to linear complexity.O(n). In greeddy method, best local optimal solutions are considered to 
generate the global optimal solution.*/
import java.util.*;

public class AppleStock{
public static void main(String[] args) {
	System.out.println("Enter the array of elements for Apple Stock...");
	System.out.println("Enter size of array");
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.nextLine());
	if(n < 2){
		System.out.println("No suffient Input");
	}
	int[] arr = new int[n];
	for (int i=0;i<n ;i++ ) {
		arr[i] = Integer.parseInt(sc.next());
		
	}
	int out =BestPrice1(arr);
	System.out.println("BruteForce Best price is=:"+ out);
	out =BestPrice2(arr);
	System.out.println("Greedy Best price is=:"+ out);
}
public static int BestPrice1(int[] x){
	int maxprice =x[1]-x[0];
	for(int i=0;i<x.length;i++){
		int currprice = x[i];
		for(int j=i+1;j<x.length;j++){
			if(x[j]-currprice >maxprice){
				maxprice = x[j]-currprice;
			}
		}
	}
	return maxprice;
}
public static int BestPrice2(int[] x){
	int baseprice = x[0];
	int maxprice = x[1]-x[0];
	for (int i=1;i<x.length ;i++ ) {
		int price = x[i]-baseprice;
		if(x[i] < baseprice){
			baseprice = x[i];
		}
		if(price > maxprice){
			maxprice = price;
		}
	}
	return maxprice;
}
}
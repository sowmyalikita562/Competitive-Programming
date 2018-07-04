import java.util.*;

public class Temperature{
	public static int[] arr;
	public static double mean;
	public static void main(String[] args) {
		System.out.println("Enter array of temperatures");
		System.out.println("Enter size");
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		arr = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(sc.next());
		}
		insertionSort(arr);
		System.out.println("Max is"+ getMax());
		System.out.println("Min is"+ getMin());
		System.out.println("Mean is"+ getMean());
		System.out.println("Mode is"+ getMode());

	}
	public static int getMax(){
		return(arr[arr.length-1]);
	}
	public static int getMin(){
		return(arr[0]);
	}
	public static double getMean(){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		mean = (double)sum/(double) arr.length;
		// System.out.println(mean);
		return mean;
	}
	public static int getMode(){
	   int median;
	   int n=arr.length;
	   if(n%2!=0){
	   	median = arr[n/2];
	   }
	   else{
	   	median= (arr[(n-1)/2]+arr[n/2])/2;
	   }
	   // System.out.println(mean);
	   // System.out.println(median);
	   int mode = (int)(3*median -2* mean);
	   return mode;

	}
	 public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
}
import java.util.*;

public class MeetMerge{
	public static void main(String[] args) {
		 System.out.println("Enter the size of array of meet times");
		Scanner sc = new Scanner(System.in);
		 int n = Integer.parseInt(sc.nextLine());
		System.out.println("enter space seperaated elements as start and end time");
		TreeMap<Integer, Integer> meet = new TreeMap<>();
		for(int i=0;i<n;i++){
			String line =sc.nextLine();
			String[] in = line.split(" ");
			meet.put(Integer.parseInt(in[0]),Integer.parseInt(in[1]));
			// System.out.print(i);
		}
		meetmerge(meet);
	}
	public static void meetmerge(TreeMap<Integer,Integer> x){
  		Iterator it = x.entrySet().iterator();
  		Stack<Integer> stack = new Stack<>();
  		while(it.hasNext()){
  			Map.Entry val = (Map.Entry)it.next();
  			if(stack.empty()){
  				stack.push(Integer.parseInt(val.getKey().toString()));
  				stack.push(Integer.parseInt(val.getValue().toString()));
  			}
  			else{
  				// Hashmap<Integer,Integer> xyz = new Hashmap<>();
  				// xyz.put(stack.peek().getKey(),stack.peek().getValue());
  				if(stack.peek() >= Integer.parseInt(val.getKey().toString())){
  					stack.pop();
  					stack.push(Integer.parseInt(val.getValue().toString()));
  				}
  				else{
  					stack.push(Integer.parseInt(val.getKey().toString()));
  				    stack.push(Integer.parseInt(val.getValue().toString()));
  				}

  			}
  		}
  		TreeMap<Integer,Integer> output = new TreeMap<>();
  		while(!stack.empty()){
  			// System.out.println("After Merging");
  			int s = stack.pop();
  			int t = stack.pop();
  			// System.out.println(t+" "+s+"\n");
  			
  			output.put(t,s);
  		}
  		Iterator its = output.entrySet().iterator();
  		System.out.print("[");
    	while (its.hasNext()) {
        Map.Entry pair = (Map.Entry)its.next();
        System.out.print("("+pair.getKey() + " " + pair.getValue()+") ");

	}
	System.out.print("]");
}
}
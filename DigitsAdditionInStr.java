package proj1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DigitsAdditionInStr {
	
	public class MostFre {
		public static int max_count = 0;
	    static ArrayList<String> mostFrequent(String arr[], int n){
	         
	        // Insert all elements in hash
	        Map<String, Integer> map =new HashMap<>();
	         
	        for(int i = 0; i < n; i++)
	        {
	            String key = arr[i];
	            if(map.containsKey(key))
	            {
	                int frequency = map.get(key);
	                frequency+=1;
	                map.put(key, frequency);
	            }
	            else
	            {
	                map.put(key, 1);
	            }
	        }
	         
	        // find max frequency.
	        
			String ans = null;
			ArrayList<String> answer = new ArrayList<String>();
	         
	        for(Entry<String, Integer> value : map.entrySet())
	        {
	            if (max_count <= value.getValue())
	            {
	                ans = value.getKey();
	                max_count = value.getValue();
	            }
	        }
	         
//	        return ans;
	        for(Entry<String, Integer> value : map.entrySet())
	        {
	            if (max_count == value.getValue())
	            {
	                answer.add( value.getKey());
	            }
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		String str="kjhds23kjnk4565kjhhhhk";
		String newStr="";
		int n=0;
		for(int i=0;i<str.length();i++) {
				 int a=str.charAt(i);
				 if(a<97) {
					 n=n+a-48;
				 }
				 else {
					 newStr+=str.charAt(i);
				 }
			}
		System.out.println("Sum of the digits is "+n);
		String[] charArr=newStr.split("");
		ArrayList<String> answer=MostFre.mostFrequent(charArr,newStr.length() );
		System.out.print("Characters with max frequency are: ");
		System.out.println(answer);
		System.out.println("Frequency is "+MostFre.max_count);
	}

}

package proj1;

import java.util.*;

public class SmallestPositiveInteger {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		
		int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }
        
        HashSet < Integer > hash = new HashSet < Integer > ();
        for (int i = 0; i < array.length; i++) {
          hash.add(array[i]);
        }
        for (int i = 1; i <= array.length; i++) {
          if (!hash.contains(i)) {
            System.out.println(i);
            break;
          }
        }
        sc.close();
        
        
		
		
		
		
	}

}

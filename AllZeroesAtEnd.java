package proj1;

import java.util.ArrayList;
import java.util.Scanner;

public class AllZeroesAtEnd {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements"); //list = {1,0,3,-2,0,2,1}
		int l=sc.nextInt();
		for(int i=0;i<l;i++) {
			arr.add(sc.nextInt());
		}
		sc.close();
		for(int i=0;i<l;i++) {
			if(arr.get(i)==0) {
				arr.add(0);
				arr.remove(i);
				i=i-1;
				l=l-1;
			}
		}
		System.out.println(arr.toString());
	}

}

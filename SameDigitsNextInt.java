package proj1;

import java.util.Arrays;

public class SameDigitsNextInt {
	
	public static void main(String[] args) {
		String str="529401";
		int l=str.length();
		int[] arr=new int[l];
		int[] ansArr=new int[l];
		int n = Integer.parseInt(str);
		int i=0;
		
		while(n>0) {
			arr[l-1-i]=n%10;
			n=n/10;
			i++;
		}
		
		for(i=l-1;i>0;i--) {
			if(arr[i]>arr[i-1]) {
				System.arraycopy(arr, 0, ansArr, 0,i-1);
				System.out.println(Arrays.toString(ansArr));
				int[] toAscArr = Arrays.copyOfRange(arr,i,l);
				System.out.println(Arrays.toString(toAscArr));
				Arrays.sort(toAscArr);
				System.out.println(Arrays.toString(toAscArr));
				for(int j=0;j<=toAscArr.length-1;j++) {
					if(toAscArr[j]>arr[i-1]) {
						ansArr[i-1]=toAscArr[j];
						toAscArr[j]=arr[i-1];
						break;
					}
				}
			Arrays.sort(toAscArr);
			System.out.println(Arrays.toString(toAscArr));
			System.arraycopy(toAscArr, 0, ansArr,i,toAscArr.length);
			break;
			}
		}
		System.out.println(Arrays.toString(ansArr));
		
		int ans=0;
		for(int k=0;k<l;k++) {
		    ans=ans*10+ansArr[k];
		}
		
		if(ans>=0) {
			System.out.println(ans);
		}
		else {
			System.out.println(-1);
		}
		
		
		
	    
	}

}

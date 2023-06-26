package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {
 public static void main(String[] args) {
	 
			int[] arr = {1,2,3,4,7,6,8};
			int len=arr.length;
			Arrays.sort(arr);
			for(int i=arr[0];i<len;i++) {
			 
			 if(i!=arr[i]) {
				 System.out.println("Missing Element in the given Array" + " " +arr[i]);
				 break;
			 }
			}
			
 }
}

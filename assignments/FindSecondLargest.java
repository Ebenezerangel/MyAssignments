package week1.day2.assignments;
import java.util.Arrays;


public class FindSecondLargest {

	public static void main(String[] args) {

		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int len=data.length-2;
		System.out.println("SecondLargest number in the given Array is" + " " +data[len]);
	}
}

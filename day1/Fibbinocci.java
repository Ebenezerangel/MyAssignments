package week1.day1;

public class Fibbinocci {
	 public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firstNum);
		for(firstNum=1;firstNum<=11;firstNum++) {
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);
		}
		
		
	}
		
	

}

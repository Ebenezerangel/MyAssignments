package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=2; i<n-1;i++) {
			if(n%i==0) {
				count++;
			}
		}
			
		if(count>1) {
				System.out.println("The Given number " +  n + " is Non-Prime");
			}
		
			
		else { 
				System.out.println("The Given number " + n + " is Prime");
			}
				
		}
			
	}

			
		
		
	



package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		boolean t=true;
		for (int i = 2; i < n-1; i++) {
			if (n%i == 0) {
				t=false;
				break;
			}}
		if(t==true) {
			System.out.println(n+" is the prime number");		
		}else
			System.out.println(n+" is not a prime number");		
	}
	
}

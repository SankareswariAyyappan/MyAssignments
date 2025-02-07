package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
	int a=0,b=1,n=8;
	System.out.println(a);
	System.out.println(b);
	for(int i=0;i<=n;i++) {
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
}
}

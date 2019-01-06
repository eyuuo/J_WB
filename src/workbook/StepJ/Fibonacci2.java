package workbook.StepJ;

import java.util.Scanner;

public class Fibonacci2 {
	
	private float gold,gold2;
	
	public Fibonacci2(){input();}
	
	void input() {
		int n=2;
		int n2=1,n3,i=2;
		while(true) {
			gold = (float)fibonacci(i+1)/(float)fibonacci(i);
			gold2 = (float)fibonacci(i+2)/(float)fibonacci(i+1);
			if(Math.abs(gold-gold2)<0.0000001) break;
			System.out.printf("%d번째 (%d/%d): %f\n",i,n,n2,gold);
			n3=n; n=n+n2; n2=n3; i++;
		}
			
	}
	
	int fibonacci(int n) {
		if(n==1||n==2) return 1;
		if(n>2) return (fibonacci(n-1)+fibonacci(n-2));
		return 0;
	}
	
}

package workbook.StepJ;

import java.util.Scanner;

public class Fibonacci {
	
	private int num;
	
	public Fibonacci(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("1부터 20까지 피보나치 수는 다음과 같습니다.");
		for(int i=1;i<=20;i++) {
			num = fibonacci(i);
			System.out.printf("%d번째 : %d\n",i,num);
		}
			
	}
	
	int fibonacci(int n) {
		if(n==1||n==2) return 1;
		if(n>2) return (fibonacci(n-1)+fibonacci(n-2));
		return 0;
	}
	
}

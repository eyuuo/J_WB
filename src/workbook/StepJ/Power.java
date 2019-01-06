package workbook.StepJ;

import java.util.Scanner;

public class Power {

	private int n1,n2;
	
	public Power(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자 2개를 입력하시오.");
		n1=s.nextInt(); n2=s.nextInt();
		System.out.printf("%d의 %d승은 %d입니다.\n",n1,n2,power(n1, n2));
	}	
	
	int power(int num1, int num2)  {
		if(num2==0) return 1;
		if(num2==1) return num1;
		if(num2>1) {
			if(num2%2==0)return (power(num1,num2/2)*power(num1,num2/2));
			if(num2%2==1) return (power(num1,num2/2)*power(num1,num2/2)*num1);
		}
			
		return 0;
	}
	
}

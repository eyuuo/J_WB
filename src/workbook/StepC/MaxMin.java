package workbook.StepC;

import java.util.Scanner;

public class MaxMin {
	private int num1,num2,num3;
	private int max_num,min_num;
	
	public MaxMin() {input();}

	public void printMaxMin() {
		if(num1>num2&&num1>num3)
			max_num=num1;
		if(num2>num1&&num2>num3)
			max_num=num2;
		if(num3>num2&&num3>num1)
			max_num=num3;
		if(num1<num2&&num1<num3)
			min_num=num1;
		if(num2<num1&&num2<num3)
			min_num=num2;
		if(num3<num2&&num3<num1)
			min_num=num3;
		System.out.printf("가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.\n",max_num,min_num);
			
	}
	
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		num1=s.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		num2=s.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		num3=s.nextInt();
	}
}

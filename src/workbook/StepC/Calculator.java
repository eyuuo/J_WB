package workbook.StepC;

import java.util.Scanner;

public class Calculator {
	
	private int num1,num2,result;
	private String operator ;

	public Calculator() {input();}
	
	public void printCal() {
		System.out.printf("계산식의 결과 값은 %d입니다.\n",getCal());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자1을 입력하세요.");
		num1 = s.nextInt();
		System.out.printf("숫자2을 입력하세요.");
		num2 = s.nextInt();
		System.out.printf("연산 기호 문자 (+,-,*,/ 중 1개를 입력하세요.)");
		operator = s.next();
	}
	int getCal() {
		if(operator.equalsIgnoreCase("+"))
			result=num1+num2;
		if(operator.equalsIgnoreCase("-"))
			result=num1-num2;
		if(operator.equalsIgnoreCase("*"))
			result=num1*num2;
		if(operator.equalsIgnoreCase("/"))
			result=num1+num2;
		return this.result;
	}
	
	
}

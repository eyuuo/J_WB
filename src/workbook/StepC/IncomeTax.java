package workbook.StepC;

import java.util.Scanner;

public class IncomeTax {
	private int income;
	private float tax;
	
	public IncomeTax() {input();}
	
	public void printTax() {
		System.out.printf("연봉 금액에 대한 소득세는 %.0f원 입니다.\n",getTax());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("연봉(원 단위)을 숫자로 입력하세요.");
		income = s.nextInt();
	}
	
	float getTax(){
		if(income<10000000)
			tax = (float) ((float)income * 0.095);
		else if(income<40000000)
			tax = (float) ((float)income * 0.19);
		else if(income<80000000)
			tax = (float) ((float)income * 0.28);
		else if(income>=80000000)
			tax = (float) ((float)income * 0.37);
		return this.tax;
	}
}

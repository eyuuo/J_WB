package workbook.StepB;

import java.util.Scanner;

public class Apartment2 {
	private double m2_area;
	private double pyung_area;
	
	public Apartment2(){input();}
	public void printArea() {
		System.out.printf("아파트의 평형은 "+getArea()+"입니다.\n");
		if(pyung_area<30)
			System.out.printf("30평 미만이므로 작은 아파트입니다.\n");
		else 
			System.out.printf("30평 이상이므로 큰 아파트입니다.\n");
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오.");
		this.m2_area = s.nextDouble();
	}	
	double getArea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}	
}

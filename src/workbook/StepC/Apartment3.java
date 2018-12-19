package workbook.StepC;

import java.util.Scanner;

public class Apartment3 {
	private double m2_area;
	private double pyung_area;
	
	public Apartment3(){input();}
	public void printArea() {
		System.out.printf("아파트의 평형은 %.1f입니다.\n",getArea());
		if(pyung_area<15)
			System.out.printf("소형 아파트입니다.\n");
		else if(pyung_area<30)
			System.out.printf("중소형 아파트입니다.\n");
		else if(pyung_area<50)
			System.out.printf("중형 아파트입니다.\n");
		else if(pyung_area>50)
			System.out.printf("대형 아파트입니다.\n");
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

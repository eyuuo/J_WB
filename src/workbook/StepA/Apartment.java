package workbook.StepA;

import java.util.Scanner;

public class Apartment {
	private double m2_area;
	private double pyung_area;
	
	public Apartment(){input();}
	public void printArea() {
		System.out.printf("아파트의 평형은 %d입니다.\n", getArea());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 분양 면적을 입력하시오.");
		this.m2_area = s.nextInt();
	}	
	double getArea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}	
}


package workbook.StepA2;

import java.util.Scanner;

public class Temperature {

	private double c_degree;
	private double f_degree;
	
	public Temperature(){input();}
	
	public void printTemper() {
		System.out.printf("화씨 온도는 "+getTemper()+"도 입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("섭씨 온도를 입려하시오.");
		this.c_degree = s.nextInt();
	}	
	double getTemper() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}	
	
}

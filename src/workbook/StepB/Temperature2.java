package workbook.StepB;

import java.util.Scanner;

public class Temperature2 {
	
	private double input_degree;
	private double output_degree;
	private String kind;
	
	public Temperature2(){input();}
	
	public void printTemper() {
		if(kind.equalsIgnoreCase("C"))
		System.out.printf("변환 온도는"+getTemper_c()+"도 입니다.\n");
		else if(kind.equalsIgnoreCase("F"))
		System.out.printf("변환 온도는"+getTemper_f()+"도 입니다.\n");
		else System.out.printf("잘못입력하셨습니다.\n");
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("온도를 입려하시오.");
		this.input_degree = s.nextDouble();
		System.out.println("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요.");
		this.kind = s.next();
	}	
	double getTemper_c() {
		output_degree = input_degree * 1.8 + 32;
		return this.output_degree;
	}
	double getTemper_f() {
		output_degree = (input_degree-32)/1.8;
		return this.output_degree;
	}	
	
	
}

package workbook.StepC;

import java.util.Scanner;

public class Temperature3 {
	
	private double input_degree;
	
	
	public Temperature3(){input();}
	
	public void printTemper() {
		
		if(input_degree<0)
			System.out.printf("잘못입력하셨습니다.\n");
		else if(input_degree<25)
			System.out.printf("냉수입니다.\n");
		else if(input_degree<40)
			System.out.printf("미온수입니다.\n");
		else if(input_degree<80)
			System.out.printf("온수입니다.\n");
		else if(input_degree>=80)
			System.out.printf("끓는 물입니다.\n");
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("물의 온도를 입려하시오.");
		this.input_degree = s.nextDouble();
		
	}	

}

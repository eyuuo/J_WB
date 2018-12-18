package workbook.StepB;

import java.util.Scanner;

public class Obesity {
private int height,weight;
private float bmi;
	
	public Obesity(){input();}
	public void printObesity() {
		System.out.print(getBmi()+"\n");
		if(getBmi()>=25)
		System.out.printf("당신은 비만입니다.\n");
		else
		System.out.printf("당신은 비만이 아닙니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("신장(cm단위)을 입력하세요.");
		this.height = s.nextInt();
		System.out.printf("체중(kg단위)을 입력하세요.");
		this.weight = s.nextInt();
		
	}
	
	float getBmi() {
		float hejght_m;
		hejght_m = height;
		bmi = weight/((hejght_m/100)*(hejght_m/100));
		return this.bmi;
	}
}

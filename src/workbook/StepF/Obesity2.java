package workbook.StepF;

import java.util.Scanner;

	public class Obesity2 {
	private float height,weight;
	private float bmi;
	private int bmilist[][] = new int[10][3]; // 10명에 대한 신장, 체중, 비만도수치를 담고 있는 리스트
	private int count; // 비만인 사람의 숫자
		
	public Obesity2(){input();}
	
	public void printObesity2() {
		
		for(int i=0;i<10;i++) {
				weight = bmilist[i][1];
				height = bmilist[i][0];
			bmi = weight/((height/100)*(height/100));
			bmilist[i][2]=(int)bmi;
			if(bmi>=25)
				System.out.printf("%d번째 사람은 비만입니다.\n",i+1);
				
		}
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오.",i+1);
			for(int j=0;j<2;j++) {
				this.bmilist[i][j] = s.nextInt();

			}
		}
	}
	
}

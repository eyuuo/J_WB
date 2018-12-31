package workbook.StepI;

import java.util.Scanner;

	public class Obesity3 {
	private int height,weight;
	private float bmi;
	private int bmilist[][] = new int[10][3]; // 10명에 대한 신장, 체중, 비만도수치를 담고 있는 리스트
	private int count; // 비만인 사람의 숫자
		
	public Obesity3(){input();}

	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오.",i+1);
			for(int j=0;j<2;j++) {
				this.bmilist[i][j] = s.nextInt();
				weight = bmilist[i][1];
				height = bmilist[i][0];
			}
				AskBiman(height,weight);
			
		}
	}
	
	void AskBiman(int height, int weight) {
		
			
		this.bmi = (float)weight/(((float)height/100)*((float)height/100));
		
		if(bmi<18.5)
			System.out.printf("저체중입니다.\n");
		else if(bmi<23)
			System.out.printf("정상체중입니다.\n");
		else if(bmi<25)
			System.out.printf("과체중입니다.\n");
		else if(bmi<30)
			System.out.printf("경도 비만입니다.\n");
		else if(bmi>=30)
			System.out.printf("고도 비만입니다.\n");
			
	
	}
	
}

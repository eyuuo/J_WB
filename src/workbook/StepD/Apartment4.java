package workbook.StepD;

import java.util.Scanner;

public class Apartment4 {
	private double m2_area;
	private double pyung_area;
	private int count1; // 소형 아파트 개수
	private int count2; // 중소형 아파트 개수
	private int count3; // 중형 아파트 개수
	private int count4; // 대형 아파트 개수
	private int i; // 반복문을 위한 변수
	
	public Apartment4(){input();}
	public void printArea() {
			System.out.printf("\"소형 아파트\"의 개수는 %d입니다.\n",count1);
			System.out.printf("\"중소형 아파트\"의 개수는 %d입니다.\n",count2);
			System.out.printf("\"중형 아파트\"의 개수는 %d입니다.\n",count3);
			System.out.printf("\"대형 아파트\"의 개수는 %d입니다.\n",count4);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오.");
			this.m2_area = s.nextDouble();
			System.out.printf("--> 아파트의 평형은 %.1f입니다.\n",getArea());
			if(pyung_area<15)
				count1++;
			else if(pyung_area<30)
				count2++;
			else if(pyung_area<50)
				count3++;
			else if(pyung_area>50)
				count4++;
		}
	}	
	double getArea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}	
}

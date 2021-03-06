package workbook.StepF;

import java.util.Scanner;

public class TotalAverage2 {
	
	private int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트
	private int sum[] = new int[5]; // 3과목 총점 리스트
	private double average[] = new double[5]; // 3과목 평균 리스트
	private int kor, eng, mat; // 3과목 점수 입력을 위한 변수
		
	public TotalAverage2(){input();}
	
	public void printTotalAverage2() {
		for(int i=0; i<5;i++) {
			average[i] = sum[i]/3.0;
			System.out.printf("%d번 학생의 총점은 %d이고, 평균은 %.1f 입니다.\n",i+1,sum[i],average[i]);
		}
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.printf("%d번 학생 국어, 영어, 수학 점수를 입력하시오.",i+1);
			for(int j=0;j<3;j++) {
				this.jumsu[i][j] = s.nextInt();
				sum[i] = sum[i]+ jumsu[i][j];
			}
		
		}
	
	}	
		
}

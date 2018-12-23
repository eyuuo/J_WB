package workbook.StepF;

import java.util.Scanner;

public class TotalAverage1 {
	
	private int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트
	private int sum[] = new int[3]; // 3과목 총점 리스트
	private double average[] = new double[3]; // 3과목 평균 리스트
	private int kor, eng, mat; // 3과목 점수 입력을 위한 변수
		
	public TotalAverage1(){input();}
	
	public void printTotalAverage1() {
		average[0] = sum[0]/5.0;
		average[1] = sum[1]/5.0;
		average[2] = sum[2]/5.0;
		
		System.out.printf("국어의 총점은 %d이고, 평균은 %.1f 입니다.\n",sum[0],average[0]);
		System.out.printf("영어의 총점은 %d이고, 평균은 %.1f 입니다.\n",sum[1],average[1]);
		System.out.printf("수학의 총점은 %d이고, 평균은 %.1f 입니다.\n",sum[2],average[2]);
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.printf("%d번 학생 국어, 영어, 수학 점수를 입력하시오.",i+1);
			for(int j=0;j<3;j++) {
				this.jumsu[i][j] = s.nextInt();
			}
			sum[0] = sum[0]+ jumsu[i][0];
			sum[1] = sum[1]+ jumsu[i][1];
			sum[2] = sum[2]+ jumsu[i][2];
		}
	
	}	
		
}

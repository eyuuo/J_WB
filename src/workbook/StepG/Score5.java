package workbook.StepG;

import java.util.Scanner;

public class Score5 {
	
	private int jumsu[][] = new int[5][3];
	private int c_average[] = new int[3];
	private String class_name[] = {"국어","영어","수학"};
	private int kor,eng,math;
	private int sum=0,grade;
	private double average=0;
	
	public Score5(){input();}
	
	public void printScore() {
		
		System.out.printf("1) 각 과목별 총점과 평균 점수\n");
		for(int j=0;j<3;j++) 
			System.out.printf("%s 과목 총점은 %d 평균은 %.1f입니다. \n",class_name[j],c_average[j],c_average[j]/5.0 );
		
		System.out.printf("2) 각 학생별 총점과 평균 점수\n");
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				this.sum = sum+ jumsu[i][j];
				this.average = sum/3.0;
			}
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 ",i+1,sum,average );
			if(average<60)
				System.out.printf("F\n");
			else if(average<70)
				System.out.printf("D\n");
			else if(average<80)
				System.out.printf("C\n");
			else if(average<90)
				System.out.printf("B\n");
			else if(average>=90)
				System.out.printf("A\n");
			sum=0;
		}
	
	
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.printf("%d번 학생의 국어, 영어, 수학 점수는? ",i+1);
			for(int j=0;j<3;j++) {
				this.jumsu[i][j]=s.nextInt();
				this.c_average[j]= c_average[j]+jumsu[i][j];
			}
		}
	}	
}

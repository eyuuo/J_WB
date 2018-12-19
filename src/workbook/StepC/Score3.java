package workbook.StepC;

import java.util.Scanner;

public class Score3 {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public Score3(){input();}
	public void printScore() {
		average=getScore()/3.0;
		System.out.printf("입력하신 점수의 총점 "+getScore()+"이고, \n" );
		System.out.printf("평균은 %.1f 입니다.\n",average);
	if(average<60)
		System.out.printf("가 입니다.\n");
	else if(average<70)
		System.out.printf("양  입니다.\n");
	else if(average<80)
		System.out.printf("미 입니다.\n");
	else if(average<90)
		System.out.printf("우 입니다.\n");
	else if(average>=90)
		System.out.printf("수 입니다.\n");
	
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요.");
		this.kor = s.nextInt();
		System.out.printf("영어 점수를 입력하세요.");
		this.eng = s.nextInt();
		System.out.printf("수학 점수를 입력하세요.");
		this.math = s.nextInt();
	}	
	int getScore() {
		total = kor+eng+math;
		return this.total;
	}	
}

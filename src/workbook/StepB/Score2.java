package workbook.StepB;

import java.util.Scanner;

public class Score2 {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public Score2(){input();}
	public void printScore() {
		System.out.printf("입력하신 점수의 총점 "+getScore()+"이고, \n" );
		System.out.printf("평균은 "+getScore()/3.0+ "입니다.\n");
	if(kor>eng&&kor>math)
		System.out.printf("국어점수가 우수합니다.\n");
	if(eng>kor&&eng>math)
		System.out.printf("영어점수가 우수합니다.\n");
	if(math>eng&&math>kor)
		System.out.printf("수학점수가 우수합니다.\n");
	
		
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

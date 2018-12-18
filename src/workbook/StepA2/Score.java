package workbook.StepA2;


import java.util.Scanner;

public class Score {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public Score(){input();}
	public void printScore() {
		System.out.printf("입력하신 점수의 총점 "+getScore()+"이고, \n" );
		System.out.printf("평균은 "+getScore()/3.0+ "입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요.");
		this.kor = s.nextInt();
		System.out.printf("영 점수를 입력하세요.");
		this.eng = s.nextInt();
		System.out.printf("수 점수를 입력하세요.");
		this.math = s.nextInt();
	}	
	int getScore() {
		total = kor+eng+math;
		return this.total;
	}	
}

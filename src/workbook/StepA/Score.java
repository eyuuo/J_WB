package workbook.StepA;

import java.util.Scanner;

public class Score {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public Score(){input();}
	public void printAge() {
		System.out.printf("입력하신 점수의 총점 %d이고, \n", getScore());
		System.out.printf("평균은 %d입니다.\n", getScore()/3.0);
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

package workbook.StepF;

import java.util.Scanner;

public class Score4 {
	
	private double score[] = new double[10];//심사 점수 리스
	private double maxscore, minscore; // 가장 큰 점수, 가장 작은 점수
	private double total; // 점수 총 합계
	private double average; // 평균점수
	private int newnum; // 숫자 입력을 위한 변수
	
	public Score4(){input();}
	
	public void printAverage() {
		System.out.printf("가장 큰 점수와 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.",getAverage());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d번 심사점수를 입력하시오.",i+1);
			this.score[i] = s.nextDouble();
			total = total+score[i];
		}
	
	}	
	double getAverage() {
		maxscore= score[0];
		minscore= score[0];
		for(int i=0;i<10;i++) {
			if(maxscore<score[i])
				maxscore=score[i];
			if(minscore>score[i])
				minscore=score[i];
		}
		total= total - maxscore - minscore;
		average = total/8.0;
		return this.average;
	}	
}

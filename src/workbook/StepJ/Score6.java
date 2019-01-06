package workbook.StepJ;

import java.util.Scanner;

public class Score6 {
	
	private double score[] = new double[10];//심사 점수 리스
	private double maxscore, minscore; // 가장 큰 점수, 가장 작은 점수
	private double total; // 점수 총 합계
	private double average; // 평균점수
	
	
	public Score6(){input();}
	
	public void printAverage() {
		System.out.printf("가장 큰 점수와 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다.\n",average);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d번 심사점수를 입력하시오.",i+1);
			this.score[i] = s.nextDouble();
			this.total = total+score[i];
			}
		this.maxscore = Max(score);
		this.minscore = Min(score);
		this.total= total - maxscore - minscore;
		this.average = total/8.0;
	}	
	
	double Max(double num[]) {
		
		double maxscore= num[0];
		for(int i=0;i<10;i++) {
			if(maxscore<num[i])
				maxscore=num[i];
		}
		
		return maxscore;
		
	}
	
	double Min(double num[]) {
		
		double minscore= num[0];
		for(int i=0;i<10;i++) {
			if(minscore>num[i])
				minscore=num[i];
		}
		
		return minscore;
	}
	
	
}

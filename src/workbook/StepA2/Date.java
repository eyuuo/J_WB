package workbook.StepA2;

import java.util.Scanner;

public class Date {
	private int days;
	private int seconds;
	
	public Date(){input();}
	public void printDate() {
		System.out.printf("날 수에 해당되는 시간은 "+getDate()+"초 입니다.\n", getDate());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하세요.");
		this.days = s.nextInt();
	}	
	int getDate() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}	
}

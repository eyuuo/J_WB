package workbook.StepB;

import java.util.Scanner;

public class Date2 {
	private int days;
	private int seconds;
	private int m_count;
	
	public Date2(){input();}
	public void printDate() {
		System.out.printf("날 수에 해당되는 시간은 %d초 입니다.\n", getSeconds());
		seconds=getSeconds();
		if(seconds>1000000) {
		m_count =0;
		while(true) {
			m_count ++;
			if(seconds<=1000000)break;
			seconds = seconds/1000000;
		}
		System.out.printf("100만초가 모두 "+m_count+"번이나 포함됩니.\n");	
	}
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하세요.");
		this.days = s.nextInt();
	}	
	int getSeconds() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}	
}

package workbook.StepC;

import java.util.Scanner;

public class Date3 {
	private int month,day;
	private int day_count;

	public Date3(){input();}
	public void printDate() {
		
		if(month<1||month>12)
			System.out.printf("잘못입력하셨습니다.\n");
		else if(day<1) {
			System.out.printf("잘못입력하셨습니다.\n");}
		else
		System.out.printf("이 날짜는 1년 %d 번째 날에 해당됩니다.\n", getday_count());
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("월을 입력하세요.");
		this.month = s.nextInt();
		System.out.printf("일을 입력하세요.");
		this.day = s.nextInt();
	}	
	int getday_count() {
		
		for(int i=1;i<month;i++)
		{
			day_count=day_count+31;
			//System.out.println("--->"+day_count);
			if(i==2)
				day_count=day_count-3;
			if(i==4||i==6||i==9||i==11)
				day_count--;
			//System.out.println("---"+day_count);
		}
		day_count=day_count+day;
		//System.out.println(day_count);
		return this.day_count;
	}	
}

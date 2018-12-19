package workbook.StepC;

import java.util.Scanner;

public class Date3 {
	private int month,day;
	private int day_count;

	public Date3(){input();}
	public void printDate() {
		
		if(month<1||month>12)
			System.out.printf("월을 잘못입력하셨습니다.\n");
		if(day<1) {
			System.out.printf("일을 잘못입력하셨습니다.\n");}
		else if(month==2) {
			if(day>28)
			System.out.printf("일을 잘못입력하셨습니다.\n");}
		else if(month==4||month==6||month==9||month==11&&day>30) {
			System.out.printf("일을 잘못입력하셨습니다.\n");}
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==11||month==12&&day>31){
				System.out.printf("일을 잘못입력하셨습니다.\n");
		}
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

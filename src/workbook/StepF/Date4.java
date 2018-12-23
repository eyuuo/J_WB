package workbook.StepF;

import java.util.Scanner;

public class Date4 {

	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1~12월의 날 수
	private int month, day; // 입력받은 월, 일
	private int day_count; // 1년 중 날 수
	private int i; // 반복문을 위한 변수

	public Date4(){input();}
	public void printDate() {
		
	    if(month<1||month>12||day<1)
			System.out.printf("잘못입력하셨습니다.\n");
		else if(month==2) {
			if(day>28)
			System.out.printf("일을 잘못입력하셨습니다.\n");}
		else if((month==4||month==6||month==9||month==11)&&day>30) {
			System.out.printf("일을 잘못입력하셨습니다.\n");}
		else if((month==1||month==3||month==5||month==7||month==8||month==10||month==11||month==12)&&day>31){
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
		
		for(int i=0;i<month;i++)
			day_count=day_count+monthdays[i];
		day_count=day_count+day-monthdays[month-1];
		return this.day_count;
	}	
}

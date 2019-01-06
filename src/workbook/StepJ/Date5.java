package workbook.StepJ;

import java.util.Scanner;

public class Date5 {

	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1~12월의 날 수
	private int month1, day1; // 입력받은 월, 일
	private int month2, day2; // 입력받은 월, 일
	private int result,day_count1, day_count2,check; // 1년 중 날 수
	

	public Date5(){input();}
	
	public void printDate() {
		
		if(check==1)System.out.printf("잘못입력하셨습니다.\n");
		else{
			this.day_count1=CalcDate(month1,day1);
			this.day_count2=CalcDate(month2,day2);
			this.result = Math.abs(day_count1 - day_count2);
		    System.out.printf("두 날짜의 간격은 %d입니다.\n",result);
		}
		
	   
	}	
	
	void input() {
	
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 날짜를 입력하시오.(월,일)");
		this.month1 = s.nextInt();
		this.day1 = s.nextInt();
		this.check = check(this.month1, this.day1);
		
		
		
		System.out.printf("두번째 날짜를 입력하시오.(월,일)");
		this.month2 = s.nextInt();
		this.day2 = s.nextInt();
		this.check = check(this.month2, this.day2);
		
		
	}	

	int CalcDate(int month, int day) {
		int day_count = 0;
		for(int i=0;i<month;i++)
			day_count=day_count+monthdays[i];
		day_count=day_count+day-monthdays[month-1];
		return day_count;
	}
	
	int check(int month, int day) {
		if(month<1||month>12||day<1)
			return 1;
		else if(month==2) {
			if(day>28)
				return 1;}
		else if((month==4||month==6||month==9||month==11)&&day>30) {
			return 1;}
		else if((month==1||month==3||month==5||month==7||month==8||month==10||month==11||month==12)&&day>31){
			return 1;
		}
		return 0;
	}
	
}

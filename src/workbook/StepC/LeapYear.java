package workbook.StepC;
import java.util.Scanner;

public class LeapYear {
	private int year;
	
	public LeapYear() {input();}
	
	public void printLeap() {
		if(getLeap()==0)
			System.out.printf("윤년입니다.\n");
		else 
			System.out.printf("윤년이 아닙니다.\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("년도를 입력하세요.");
		year = s.nextInt();
	}
	
	int getLeap() {
		if(year%4==0&&year%100!=0||year%400==0)
		return 0;
		else return 1;
		
	}
	
}

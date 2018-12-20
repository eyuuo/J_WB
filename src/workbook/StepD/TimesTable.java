package workbook.StepD;
import java.util.Scanner;

public class TimesTable {

	private int dan,i;
	
	public TimesTable() {input();}
	
	public void printTimes() {
		for(i=1;i<=9;i++) {
			System.out.print(dan+" x "+i+"="+dan*i+"\n");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9).");
			dan = s.nextInt();
			if(dan<2&&dan>9) 
				System.out.print("잘못입력하셨습니다.\n");
			else break;
		}
		
		
	}
}

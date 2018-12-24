package workbook.StepE;
import java.util.Scanner;

public class TimesTable2 {

	private int mode;
	
	public TimesTable2() {input();}
	
	public void printTimes2() {
		
		for(int i=3;i<=9;i=i+2) {
			for(int j=1; j<=9; j++){
				if(mode == 1)
				System.out.printf("%d X %d = %-2d    ",i,j,i*j);
				else if(mode == 2)
					System.out.printf("%d X %d = %-2d    ",i-1,j,(i-1)*j);
				if(j%3==0)System.out.print("\n");
			}
			System.out.print("\n");
		}
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
			System.out.print("구구단의 출력모드(1:홀수단, 2:짝수단)를 입력하시오.");
			this.mode = s.nextInt();

	}
}

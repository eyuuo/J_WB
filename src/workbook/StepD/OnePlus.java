package workbook.StepD;
import java.util.Scanner;

public class OnePlus {
	private int number,i;
	private int totalsum=0;
	
	public OnePlus() {input();}
	
	public void printSum() {
		System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은 "+totalsum+"입니다.\n");
	}
	void input(){
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		this.number = s.nextInt();
		for(i=1;i<=number;i++) {
			totalsum = totalsum + i;
		}
	}

}

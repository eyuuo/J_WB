package workbook.StepD;
import java.util.Scanner;

public class TotalAverage {
	private int number, totalsum=0;
	private int count =-1;
	private double average;
	
	public TotalAverage() {
		input();
	}
	public void printTA() {
		System.out.printf("입력한 %d 개의 숫자들의 총합계는 %d 이고, 평균 값은 %.1f 입니다.\n",count,totalsum,average );
	}
	void input() {
		Scanner s = new Scanner(System.in);
		while(number<=100&&number>=0) {
			count++;
			totalsum = totalsum+number;
			System.out.print("0부터 100 사이의 숫자를 입력하세요.");
			this.number = s.nextInt();
		}
		average = (double)totalsum/count;
	}
}

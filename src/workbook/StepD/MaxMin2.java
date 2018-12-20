package workbook.StepD;

import java.util.Scanner;

public class MaxMin2 {
	private int number;
	private int max_num,min_num;
	
	public MaxMin2() {input();}

	public void printMaxMin() {
		System.out.printf("가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.\n",max_num,min_num);
			
	}
	
	void input(){
		Scanner s = new Scanner(System.in);
		max_num=0;
		min_num=100;
	while(number<=100&&number>=0) {
		if(max_num<number)
			max_num=number;
		System.out.print("0부터 100 사이의 숫자를 입력하세요.");
		this.number=s.nextInt();
		if(min_num>number)
			min_num=number;
		
	}
		
		
	}
}

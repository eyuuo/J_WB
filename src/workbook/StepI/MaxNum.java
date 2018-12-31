package workbook.StepI;

import java.util.Scanner;

public class MaxNum {
	private int max_num;
	private int num[] = new int[10];
	
	public MaxNum() {input();}

	public void printMax() {
		
		System.out.printf("최댓값은 %d입니다.\n", MaxOfTen());
			
	}
	
	void input(){
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i<10;i++) {
			System.out.printf("%d번 수를 입력하시오.",i+1);
			this.num[i]=s.nextInt();
		}
	}
	
	int MaxOfTen() {
		this.max_num=num[0];
		for(int i = 0; i<10;i++)
			if(max_num<num[i])
				max_num = num[i];
		return max_num;
	}
}

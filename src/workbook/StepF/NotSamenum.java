package workbook.StepF;

import java.util.Scanner;

public class NotSamenum {
	private int number[] = new int[10];// 사용자가 입력한 숫자 10개
	int newnum; // 입력받은 숫자
	int count; // 현재까지 입력된 숫자의 개수(0~10)
	boolean dup; // 중복검사 통과 여부 (true : 중복, false : 중복없음)
	
	public NotSamenum(){input();}
	public void printNnumber() {
		for(int i=0;i<10;i++)
			System.out.printf("%d번째 숫자는 %d입니다.\n",i+1,number[i]);
			
	}	
	
	void input() {
		int i, j; // 반복문 사용을 위한 변수
		Scanner s = new Scanner(System.in);
		System.out.printf("1부터 100사이의 숫자를 입력하세요.");
		for(i=0;i<10;i++) {
				System.out.printf("%d번째 숫자를 입력하세요.",i+1);
				number[i] = s.nextInt();
				for(j = 0; j<i; j++)
				if(number[i]==number[j]) {
					System.out.printf("잘못 입력하셨습니다. 다시 입력하세요.\n");
					i--;
				}
		}
			
	}	
}

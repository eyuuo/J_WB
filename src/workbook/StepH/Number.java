package workbook.StepH;
import java.util.Random;
import java.util.Scanner;

public class Number {
	Random generator = new Random();
	private int answer = generator.nextInt(45)+1; //컴퓨터가 만들어 낸 1부터 100사이의 임의의 숫자
	private int number_try; // 사용자가 제시한 숫자
	private int count=0; // 사용자가 맞추려고 시도한 횟수
	
	public Number(){input();}
	
	public void printNum() {
		System.out.printf("\n%d번만에 숫자를 맞추셨습니다.\n",count);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("1부터 100까지의 숫자 하나를 맞춰보세요.");
			this.count++;
			number_try = s.nextInt();
			if(answer==number_try) break;
			else if(number_try > answer)
				System.out.printf("좀 더 작은 수 입니다.\n");
			else if (number_try <answer)	
				System.out.printf("좀 더 큰 수 입니다.\n ");	
		}
	}	

}

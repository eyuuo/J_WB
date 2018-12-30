package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class LottoNumber1 {Random generator = new Random();

	private int lotto[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트
	private int count=0; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)
	private String onemore ; // 반복여부를 입력하는 문자 (Y/N)

public LottoNumber1(){input();}

public void printNum() {


}	



void input() {
	Scanner s = new Scanner(System.in);
	
	while(true) {
		
		for(int i=0;i<6;i++) {
			this.lotto[i] = generator.nextInt(45) + 1;
			for(int j = 0; j<i; j++)
				if(lotto[i]==lotto[j]) 
					i--;
		}
		System.out.printf("로또 당첨 번호는 ");
		for(int i=0;i<6;i++) 
			System.out.printf("%d ",lotto[i]);
		System.out.printf(" 입니다.\n");
		this.count++;
		System.out.printf("더 만드시겠습니까?(Y/N)");
		this.onemore = s.next();
		if(onemore.equalsIgnoreCase("N"))  break;
		
	}

	}	

}



package workbook.StepI;

import java.util.Random;

import java.util.Scanner;

public class RandomNum {Random generator = new Random();

	private int count[] = {0,0,0};
	private int Random;

public RandomNum() {input();} 

public void printNum() {
	
	System.out.printf("\n1. 대(70이상) : %d회 생성\n",count[0]);
	System.out.printf("2. 중(40이상 70미만) : %d회 생성\n",count[1]);
	System.out.printf("3. 소(40미만) : %d회 생성\n",count[2]);

}	



void input() {
	
	System.out.printf("10개의 숫자를 생성합니다.\n");
	
	for(int i=0;i<10;i++) {
			this.Random = generator.nextInt(100) + 1;
			System.out.printf("생성된 임의의 숫자는 %d입니다.\n",Random);
			if(GetRandom()==0) count[0]++;
			if(GetRandom()==1) count[1]++;
			if(GetRandom()==2) count[2]++;
		}
	}

	byte GetRandom() {
		byte n = 0;
		if(Random<40) n=2;
		else if(Random<70) n=1;
		else if(Random>=70) n=0;
		
		return n;
	}

}


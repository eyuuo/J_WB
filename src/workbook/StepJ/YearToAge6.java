package workbook.StepJ;

import java.util.Scanner;

public class YearToAge6 {
	private int birth_year; // 입력받은 태어난 년도
	private int age; // 각 사람들의 나이 (최대 100명)
	private int count_person=0; // 입력된 인원 수
	private int count[]= {0,0,0,0,0,0}; // 유아 수
	
	
	
	public YearToAge6(){input();}
	
	public void printAge() {
			
		String name[] = {"유아","어린이","청소년","청년","중년","노년"};
		for(int i=0;i<6;i++)
		System.out.printf("%s는 %d명 입니다.\n",name[i],count[i]);
		
		
	}
		
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<100;i++) {
			System.out.printf("%d번째 사람의 태어난 년도를 입력하세요.",i+1);
			this.birth_year = s.nextInt();
			if(birth_year>2018) break;
			
			
			count[AskAge(birth_year)]++;
				
		}
	}
	
	int AskAge(int birthyear) {
		
		this.age= 2018 - birthyear + 1;
		System.out.printf("나이는 %d입니다.\n",age);
		
		if(age<7)
			return 0;
		else if(age<13)
			return 1;
		else if(age<20)
			return 2;
		else if(age<30)
			return 3;
		else if(age<60)
			return 4;
		else if(age>=60)
			return 5;
		
		return 0;
		
	}
	
}

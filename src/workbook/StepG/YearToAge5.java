package workbook.StepG;

import java.util.Scanner;

public class YearToAge5 {
	private int birth_year; // 입력받은 태어난 년도
	private int age[] = new int[100]; // 각 사람들의 나이 (최대 100명)
	private int count_person=0; // 입력된 인원 수
	private int count[]= {0,0,0,0,0,0}; // 유아 수
	
	
	
	public YearToAge5(){input();}
	public void printAge() {
		for(int i=0;i<count_person;i++) 
			System.out.printf("%d번째 사함의 나이는 %d입니다.\n",i+1,age[i]);
		
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
			this.age[i]=2018 - birth_year + 1;
			this.count_person++;
			if(age[i]<7)
				count[0]++;
			else if(age[i]<13)
				count[1]++;
			else if(age[i]<20)
				count[2]++;
			else if(age[i]<30)
				count[3]++;
			else if(age[i]<60)
				count[4]++;
			else if(age[i]>=60)
				count[5]++;
				
		}
	}	
	
}

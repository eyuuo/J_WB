package workbook.StepG;

import java.util.Scanner;

public class YearToAge5 {
	private int birth_year; // 입력받은 태어난 년도
	private int age[] = new int[100]; // 각 사람들의 나이 (최대 100명)
	private int count_person=0; // 입력된 인원 수
	private int count_baby=0; // 유아 수
	private int count_child=0; // 어린이 수
	private int count_youth=0; // 청소년 수
	private int count_young=0; // 청년 수
	private int count_adult=0; // 중년 수
	private int count_old=0; // 노년 수
	
	
	public YearToAge5(){input();}
	public void printAge() {
		for(int i=0;i<count_person;i++) 
			System.out.printf("%d번째 사함의 나이는 %d입니다.\n",i+1,age[i]);
		
		System.out.printf("유아는 %d명 입니다.\n",count_baby);
		System.out.printf("어린이는 %d명 입니다.\n",count_child);
		System.out.printf("청소년은 %d명 입니다.\n",count_youth);
		System.out.printf("청년은 %d명 입니다.\n",count_young);
		System.out.printf("중년은 %d명 입니다.\n",count_adult);
		System.out.printf("노년은 %d명 입니다.\n",count_old);
		
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
				count_baby++;
			else if(age[i]<13)
				count_child++;
			else if(age[i]<20)
				count_youth++;
			else if(age[i]<30)
				count_young++;
			else if(age[i]<60)
				count_adult++;
			else if(age[i]>=60)
				count_old++;
				
		}
	}	
	
}

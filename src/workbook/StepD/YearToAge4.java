package workbook.StepD;

import java.util.Scanner;

public class YearToAge4 {
	private int birth_year,count_all;
	private int age,count_young,i;
	
	public YearToAge4(){input();}
	public void printAge() {
		System.out.printf("가족들 중에 미성년자는 모두 "+count_young+"명입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("가족이 몇 명인지 입력하세요.");
		this.count_all = s.nextInt();
		for(i=0;i<count_all;i++) {
			System.out.printf("태어난 년도를 입력하세요.");
			this.birth_year = s.nextInt();
			age=getAge();
			if(age<20)
				count_young++;
		}
	}	
	
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}	 
}

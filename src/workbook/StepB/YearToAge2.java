package workbook.StepB;

import java.util.Scanner;

public class YearToAge2 {
	private int birth_year;
	private int age;
	
	public YearToAge2(){input();}
	public void printAge() {
		if(getAge()<20)
		System.out.printf("미성년자입니다.\n");
		if(getAge()>=20)
			System.out.printf("미성년자가 아닙다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도?");
		this.birth_year = s.nextInt();
	}	
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}	 
}

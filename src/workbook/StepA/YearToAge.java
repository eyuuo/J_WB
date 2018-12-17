package workbook.StepA;

import java.util.Scanner;

public class YearToAge {
	private int year;
	private int age;
	
	public YearToAge(){input();}
	public void printAge() {
		System.out.printf("����� ���̴� %d�Դϴ�.\n", getAge());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�¾ �⵵��?");
		this.year = s.nextInt();
	}	
	int getAge() {
		age = 2018 - year + 1;
		return this.age;
	}	
}


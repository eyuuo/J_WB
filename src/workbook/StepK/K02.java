package workbook.StepK;

import java.util.Scanner;
	
public class K02{
	public void main(){
		int number;
		Scanner s = new Scanner(System.in);
		System.out.print("등록하실 메뉴의 개수를 입력하세요 : ");
		number = s.nextInt();
		MenuPan mn[] = new MenuPan[number];
		for(int i=0;i<number;i++) {
			mn[i] = new MenuPan();
			System.out.printf("%d번 메뉴의 번호 메뉴명, 원산지, 가격을 입력하시오.",i+1);
			mn[i].input();
		}
		System.out.print("\n=======================================\n");
		System.out.println("메뉴번호    메뉴이름    원산지      1인분 가격\n");
		for(int i=0;i<number;i++) {
			mn[i].print();
		}
			
		 
	}
}
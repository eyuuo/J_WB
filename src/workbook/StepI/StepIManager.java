package workbook.StepI;


import java.util.Scanner;

public class StepIManager {
	public StepIManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 메뉴판 보여주는 메소드 만들기.\n");
			System.out.print("2. 빈칸과 함께 특정 문자를 개수만큼 찍는 메소드 만들가.\n");
			System.out.print("3. 비만판정.\n");
			System.out.print("4. 메뉴 번호 받아오는 메소드 만들기.\n");
			System.out.print("5. 최댓값 리턴하는 메소드 만들기.\n");
			System.out.print("6. 임의의 숫자를 만들어 구간을 리턴하는 메소드 만들기;.\n");
			System.out.print("7. 자판기에서 선택한 음려ㅛ 가격 리턴하는 메소드 만들기.\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				//FindSmax sma = new FindSmax();
				//sma.printSmax();
				break;
			
			default:
				System.out.printf("7이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	
}

	

}


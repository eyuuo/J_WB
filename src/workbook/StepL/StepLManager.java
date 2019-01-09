package workbook.StepL;


import java.util.Scanner;

public class StepLManager {
	public StepLManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 메뉴판 저장하기.\n");
			System.out.print("2. 주차장 입출력 관리.\n");
			System.out.print("3. 식당 주문 관리.\n");
			System.out.print("4. 학생 정보 관리.\n");
			
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				L01 l1 = new L01();
				l1.main();
				break;
			case 2: 				
				L02 l2 = new L02();
				l2.main();
				break;
			case 3: 				
				L03 l3 = new L03();
				l3.main();
				break;
			case 4: 				
				L04 l4 = new L04();
				l4.main();
				break;
			default:
				System.out.printf("7이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	 
}

	

}


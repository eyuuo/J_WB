package workbook.StepK;


import java.util.Scanner;

public class StepKManager {
	public StepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 메뉴판 저장하기.\n");
			System.out.print("2. 메뉴판 저장하기2.\n");
			System.out.print("3. 좌표 저장하기.\n");
			System.out.print("4. 좌표 저장하기2.\n");
			System.out.print("5. 사용자 목록 저장하기.\n");
			System.out.print("6. 사용자 목록 저장하기2.\n");
			System.out.print("7. 학생 점수 결과 저장하기.\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				K01 k1 = new K01();
				k1.main();
				break;
			case 2: 				
				K02 k2 = new K02();
				k2.main();
				break;
			case 3: 				
				K03 k3 = new K03();
				k3.main();
				break;
			case 4: 				
				K04 k4 = new K04();
				k4.main();
				break;
			case 5: 				
				K05 k5 = new K05();
				k5.main();
				break;
			case 6: 				
				K06 k6 = new K06();
				k6.main();
				break;
			case 7: 				
				K07 k7 = new K07();
				k7.main();
				break;
			default:
				System.out.printf("7이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	 
}

	

}


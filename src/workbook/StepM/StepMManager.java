package workbook.StepM;


import java.util.Scanner;

public class StepMManager {
	public StepMManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 메뉴판 저장하기.\n");
			
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				M01 m1 = new M01();
				m1.main();
				break;
			default:
				System.out.printf("1이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	 
}

	

}


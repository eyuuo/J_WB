package workbook.StepE;

import java.util.Scanner;



public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 입력한 숫자 크기의 정사각형 출력하기.\n");
			System.out.print("2. 입력할 숫자 크기의 높이를 갖는 우직각 삼각형 출력하기. \n");
			System.out.print("3. 입력받은 숫자 크기와 높이를 갖는 이등병 삼각형 출력하기.\n");
			System.out.print("4. 홀수단 또는 짝수단의 구구단 출력하기.\n");
			System.out.print("5. 홀수단 또는 짝수단의 구구단을 열의 개수를 맞추어 출력하기.\n");
			System.out.print("6. 2차원 숫자 츨력하기.\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				Rectangle5 rec5 = new Rectangle5();
				rec5.printRectangle();
				break;
			case 2: 				
				Triangle1 tri = new Triangle1();
				tri.printTriangle();
				break;
			case 3: 				
				Triangle2 tri2 = new Triangle2();
				tri2.printTriangle2();
				break;
			case 4: 				
				TimesTable2 tim2 = new TimesTable2();
				tim2.printTimes2();
				break;
			case 5: 				
				TimesTable3 tim3 = new TimesTable3();
				tim3.printTimes3();
				break;
			case 6: 				
				Dimensional2Array Dim = new Dimensional2Array();
				Dim.printArray();
				break;
			default:
				System.out.printf("6이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	
}

}

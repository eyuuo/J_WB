package workbook.StepD;

import java.util.Scanner;



public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 1부터 숫자 더하기.\n");
			System.out.print("2. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기. \n");
			System.out.print("3. 입력받은 숫자들의 총합계와 평균 값 구하기.\n");
			System.out.print("4. 미성년자 숫자 세기.\n");
			System.out.print("5. 직사각형 형태 개수 세기.\n");
			System.out.print("6. 아파트 평형 계산 및 종류 판정.\n");
			System.out.print("7. 1차 메소드의 좌표 구하기.\n");
			System.out.print("8. 2차 메소드의 좌표 구하기.\n");
			System.out.print("9. 원하는 구구단의 단 출력하기.\n");
			System.out.print("10. 두 수의 배타적 배수 출력하기.\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				OnePlus one = new OnePlus();
				one.printSum();
				break;
			case 2: 				
				MaxMin2 mm2 = new MaxMin2();
				mm2.printMaxMin();
				break;
			case 3: 				
				TotalAverage ta = new TotalAverage();
				ta.printTA();
				break;
			case 4: 				
				YearToAge4 yta4 = new YearToAge4();
				yta4.printAge();
				break;
			case 5: 				
				Rectangle4 rec4 = new Rectangle4();
				rec4.printSize();
				break;
			case 6: 				
				Apartment4 apa4 = new Apartment4();
				apa4.printArea();
				break;
			case 7: 				
				Coordinate1 coo1 = new Coordinate1();
				coo1.printCoor();
				break;
			case 8: 				
				Coordinate2 coo2 = new Coordinate2();
				coo2.printCoor();
				break;
			case 9: 				
				TimesTable tim = new TimesTable();
				tim.printTimes();
				break;
			case 10: 				
				ExclusiveMul exc = new ExclusiveMul();
				exc.printEx();
				break;
				
			default:
				System.out.printf("11이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	
}

}

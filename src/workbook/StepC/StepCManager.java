package workbook.StepC;

import java.util.Scanner;


public class StepCManager {
	
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 나이 계산 및 미성년자 판정\n");
			System.out.print("2. 물의 온도 구간 판정 \n");
			System.out.print("3. 직사각형 넓이계산 및 정사각형 판정\n");
			System.out.print("4. 아파트 평형 계산 및 종류 판정\n");
			System.out.print("5. 연중 날짜 계산\n");
			System.out.print("6. 점수계산\n");
			System.out.print("7. 파일 전송 시간 계산\n");
			System.out.print("8. 3개의 수 중 최댓값과 최솟값 구하기\n");
			System.out.print("9. 소득세 계산\n");
			System.out.print("10. 간단한 사칙연산 계산\n");
			System.out.print("11. 윤년 판정하기\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge3 yta3 = new YearToAge3();
				yta3.printAge();
				break;
			case 2: 				
				Temperature3 tem3 = new Temperature3();
				tem3.printTemper();
				break;
			case 3: 				
				Rectangle3 rec3 = new Rectangle3();
				rec3.printSize();
				break;
			case 4: 				
				Apartment3 apa3 = new Apartment3();
				apa3.printArea();
				break;
			case 5: 				
				Date3 dat3 = new Date3();
				dat3.printDate();
				break;
			case 6: 				
				Score3 sco3 = new Score3();
				sco3.printScore();
				break;
			case 7: 				
				File3 fil3 = new File3();
				fil3.printFile();
				break;
			case 8: 				
				MaxMin mm = new MaxMin();
				mm.printMaxMin();
				break;
			case 9: 				
				IncomeTax inc = new IncomeTax();
				inc.printTax();
				break;
			case 10: 				
				Calculator cal = new Calculator();
				cal.printCal();
				break;
			case 11: 				
				LeapYear lea = new LeapYear();
				lea.printLeap();
				break;
			default:
				System.out.printf("11이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}
	}
}

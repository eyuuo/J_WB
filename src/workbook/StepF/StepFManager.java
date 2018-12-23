package workbook.StepF;

import java.util.Scanner;



public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 두 번째로 큰 수의 순서 찾기.\n");
			System.out.print("2. 심사점수 계산. \n");
			System.out.print("3. 5명의 국, 영, 수 3과목 점수의 과목별 총점, 평균값 구하기.\n");
			System.out.print("4. 5명의 국, 영, 수 3과목 점수의 학생별 총점, 평균값 구하기.\n");
			System.out.print("5. 비만 판정.\n");
			System.out.print("6. 5층 아파트의 거주자 숫자 구하기.\n");
			System.out.print("7. 5층 아파트의 층별, 호수별 거주자 숫자 구하기.\n");
			System.out.print("8. 겹치지 않는 숫자 10개 입력 받기.\n");
			System.out.print("9. 배열을 이용한 연중 날짜 계산.\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				FindSmax sma = new FindSmax();
				sma.printSmax();
				break;
			case 2: 				
				Score4 sco4 = new Score4();
				sco4.printAverage();
				break;
			case 3: 				
				TotalAverage1 toav = new TotalAverage1();
				toav.printTotalAverage1();
				break;
			case 4: 				
				TotalAverage2 toav2 = new TotalAverage2();
				toav2.printTotalAverage2();
				break;
			case 5: 				
				Obesity2 obe2 = new Obesity2();
				obe2.printObesity2();
				break;
			case 6: 				
				Apartment5 apa5 = new Apartment5();
				apa5.printArea();
				break;
			case 7: 				
				Apartment6 apa6 = new Apartment6();
				apa6.printArea();
				break;
			case 8: 				
				NotSamenum not = new NotSamenum();
				not.printNnumber();
				break;
			case 9: 				
				Date4 dat4 = new Date4();
				dat4.printDate();
				break;
			default:
				System.out.printf("9이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	
}

}

package workbook.StepJ;


import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 나이 계산 및 연령대 판정.\n");
			System.out.print("2. 심사점수 계산.\n");
			System.out.print("3. 물의 온도 구간 개수 판정.\n");
			System.out.print("4. 연중 날짜 계산 메소드를 이용한 날짜 간격 세기.\n");
			System.out.print("5. 주차 관리 시스템.\n");
			System.out.print("6. 피보나치 수 구하기.\n");
			System.out.print("7. 2의 제곱수 구하기.\n");
			System.out.print("8. Ackermann 수 구하기.\n");
			System.out.print("9. pow() 메소드 만들기.\n");
			System.out.print("10.피보나치 수열로 황금비율 구하기.\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge6 yta6 = new YearToAge6();
				yta6.printAge();
				break;
			case 2:
				Score6 sco6 = new Score6();
				sco6.printAverage();
				break;
			case 3:
				Temperature5 tem4 = new Temperature5();
				tem4.printTemper();
				break;
			case 4: 				
				Date5 dat5 = new Date5();
				dat5.printDate();
				break;
			case 5: 				
				ParkingFee pf = new ParkingFee();
				pf.printFee();
				break;
			case 6 :
				Fibonacci Fb = new Fibonacci();
				break;
			case 7 :
				Poweroftwo powt = new Poweroftwo();
				break;
			case 8 :
				Ackermann ack = new Ackermann();
				break;
			case 9 :
				Power pow = new Power();
				break;
			case 10 :
				Fibonacci2 Fb2 = new Fibonacci2();
				break;
			default:
				System.out.printf("9이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	
}

	

}


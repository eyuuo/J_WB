package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 나이 계산 및 연령대 판정.\n");
			System.out.print("2. 물의 온도 구간 판정.\n");
			System.out.print("3. 점수 계산.\n");
			System.out.print("4. 부동산 중개 수수료 계산기.\n");
			System.out.print("5. PC방 이용료 계산기.\n");
			System.out.print("6. 쇼핑몰  매출 계산기.\n");
			System.out.print("7. 놀이공원 매표소.\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge5 yta5 = new YearToAge5();
				yta5.printAge();
				break;
			case 2: 				
				
				Temperature4 tem4 = new Temperature4();
				tem4.printTemper();
				break;
			case 3: 				
				Score5 sco5 = new Score5();
				sco5.printScore();
				break;
			case 4: 				
				BrokerageFee bro = new BrokerageFee();
				bro.printFee();
				break;
			case 5: 				
				PcFee pcf = new PcFee();
				pcf.printFee();
				break;
			case 6: 				
				ShoppingMall spm = new ShoppingMall();
				spm.printFee();
				break;
			case 7: 				
				AmusementparkFee amu = new AmusementparkFee();
				amu.printFee();
				break;
			default:
				System.out.printf("7이하의 자연수를 입력하세요.\n");
				break;
			}
		
		}	
}

	

}


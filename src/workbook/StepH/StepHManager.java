package workbook.StepH;


import java.util.Scanner;

public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("---------------------\n");
		 	System.out.print("1. 숫자 알아 맞추기.\n");
			System.out.print("2. 로또 번호 만들기.\n");
			System.out.print("3. 로또 번호 당첨 확인하기.\n");
			System.out.print("4. 가위바위보 게임하기.\n");
			System.out.print("5. 슬롯머신 만들기.\n");
			System.out.print("6. 5개 숫자의 제곱수 조합 구하기.\n");
			System.out.print("7. 문자의 개수와 나누어 출력하기.\n");
			System.out.print("8. 문자열 바꾸기.\n");
			System.out.print("9. 사용자 정보 출력하기. \n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				Number num = new Number();
				num.printNum();
				break;
			case 2: 				
				LottoNumber1 lot = new LottoNumber1();
				lot.printNum();
				break;
			case 3: 				
				LottoNumber2 lot2 = new LottoNumber2();
				lot2.printNum();
				break;
			case 4:
				RockPaperScissors rps = new RockPaperScissors();
				rps.printResult();
			case 5:
				SlotMachine slm = new SlotMachine();
				slm.printSlot();	
			case 6:
				SquarePower sp = new SquarePower();
				sp.printNum();
				
			default:
				//System.out.printf("9이하의 자연수를 입력하세요.\n");
				//5번을 실행시 출력된다. 그 이유 알아보자.
				break;
			}
		
		}	
}

	

}


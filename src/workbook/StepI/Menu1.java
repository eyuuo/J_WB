package workbook.StepI;
import java.util.Random;
import java.util.Scanner;

public class Menu1 {
	
	private int total=0;
	private int money[] = {15000,10000,7000,2000};
	private int num;
	
	public Menu1(){input();}
	
	public void printPice() {
		System.out.printf("\n주문한 총 금액은 %d입니다.\n",total);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true){
			ShowMenu();
			num =s.nextInt();
			if(num==5) break;
			total = total+money[num-1];
			System.out.printf("현재까지 주문한 총 금액은 %d입니다.\n\n",total);
			
		}
	}	
	
	void ShowMenu() {
		System.out.printf("메뉴를 선택해주세요. 1. 피자(15,000원), 2. 스파게티(10,000원), 3. 샐러드(7,000원), 4. 음료수(2,000원), 5. 종료\n");
	}

}

package workbook.StepI;
import java.util.Random;
import java.util.Scanner;

public class Menu3 {
	
	private int total=0;
	private int money[] = {700,300,1000,600,500};
	private int num,count=0;
	private String str;
	
	public Menu3(){input();}
	
	public void printPice() {
		System.out.printf("\n%s개의 음료 총 금액은 %d입니다.\n",count,total);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true){
			ShowMenu();
			System.out.printf("더 필요하십니까?(Y/N)");
			this.str = s.next();
			if(str.equalsIgnoreCase("N")) break;
			
		}
	}	
	
	int ShowMenu() {
		Scanner s = new Scanner(System.in);
		System.out.printf("1. 콜(700원), 2.원두커피(300원), 3.레몬주스(1000원), 4.홍차(500원), 5.코코아(600원)\n메뉴를 선택해주세요. \n");
		this.num =s.nextInt();
		this.count++;
		this.total=this.total+ money[num-1];
		return money[num-1];
	}

}

package workbook.StepK;

import java.util.Scanner;
	
class MenuPan {
	int num,money; // 번호,이름
	String origin,name; 
	
	void input(){ // 정보를 사용자에게 입력받아 설정하는 메소드
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		name = s.next();
		origin = s.next();
		money = s.nextInt();
		}
	
	void print(){ // 설정된 정보를 출력함. System.out.println("이름은 :" + name);
	
	System.out.printf("%-10d%-10s%-10s%-10d\n",num,name,origin,money);
	}
}
 
public class K01{
	public void main(){
		
		MenuPan mn = new MenuPan();
		System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오. ");
		mn.input();
		System.out.print("\n=======================================\n");
		System.out.println("메뉴번호    메뉴이름    원산지      1인분 가격\n");
		mn.print();
	}
}
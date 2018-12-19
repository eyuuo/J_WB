package workbook.StepA2;
import java.util.Scanner;

public class pp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("---------------------\n");
			System.out.print("1. 나이계산\n");
			System.out.print("2. 온도변환\n");
			System.out.print("3. 직사각형 넓이계산\n");
			System.out.print("4. 아파트 평형 계산\n");
			System.out.print("5. 날짜계산\n");
			System.out.print("6. 점수계산\n");
			System.out.print("7. 파일 용량 계산\n");
			System.out.print("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				 
				YearToAge yta = new YearToAge();
				yta.printAge();
				break;
			case 2: 				
				Temperature tem = new Temperature();
				tem.printTemper();
				break;
			case 3: 				
				Rectangle rec = new Rectangle();
				rec.printSize();
				break;
			case 4: 				
				Apartment apa = new Apartment();
				apa.printArea();
				break;
			case 5: 				
				Date dat = new Date();
				dat.printDate();
				break;
			case 6: 				
				Score sco = new Score();
				sco.printScore();
				break;
			case 7: 				
				File fil = new File();
				fil.printFile();
				break;
			default:
				System.out.printf("7이하의 숫자를 입력하세요.\n");
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}

package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산\n");
			printf("2. 온도변환\n");
			printf("3. 직사각형 넓이계산\n");
			printf("4. 아파트 평형 계산\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 용량 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
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

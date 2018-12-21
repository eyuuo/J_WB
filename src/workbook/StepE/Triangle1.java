package workbook.StepE;

import java.util.Scanner;

public class Triangle1 {
	private int height, blank;
	
  public Triangle1(){input();}
	
		public void printTriangle() {
				for(int i =1;i<=height;i++) {
					blank--;
					for(int j = height+blank ;j>0;j--)
					{System.out.printf(" ");}
					for(int j = i ;j>0;j--)
					System.out.printf("*");
				System.out.printf("\n");
					}
		}
		
		void input() {
			Scanner s = new Scanner(System.in);
				System.out.println("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
				this.height = s.nextInt(); blank = s.nextInt();
		}	
}

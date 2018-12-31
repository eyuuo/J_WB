package workbook.StepI;

import java.util.Scanner;

public class Triangle3 {
	private int height, blank;
	private char ch;
	
  public Triangle3(){input();}
	
		public void printTriangle() {
			PrintCharWithBlank(blank, height, ch) ;
		}
		
		void input() {
			Scanner s = new Scanner(System.in);
			System.out.println("직각 삼각형을 그리는데 사용할 문자를 입력하시오.");
			this.ch = s.next().charAt(0);
			
			System.out.println("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
			this.height = s.nextInt(); this.blank = s.nextInt();
				
		}	
		
		void PrintCharWithBlank(int blanks, int size, char ch) {
			for(int i =1;i<=height;i++) {
				blank--;
				for(int j = height+blank ;j>0;j--)
				{System.out.printf(" ");}
				for(int j = i ;j>0;j--)
				System.out.print(ch);
			System.out.printf("\n");
				}
		}
}

package workbook.StepE;

import java.util.Scanner;

public class Triangle2 {
	private int height;
	
  public Triangle2(){input();}
	
		public void printTriangle2() {
				for(int i =1; i<=height; i++) {
					height=height-i;
					for(int j = height;j>0;j--)
					System.out.printf(" ");
					for(int j = i*2-1 ;j>0;j--)
					System.out.printf("*");
				System.out.printf("\n");
				height=height+i;
					}
		}
		
		void input() {
			Scanner s = new Scanner(System.in);
				System.out.println("이등변 삼각형의 높이를 입력하시오.");
				this.height = s.nextInt(); 
		}	
}

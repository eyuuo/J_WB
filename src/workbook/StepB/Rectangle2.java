package workbook.StepB;

import java.util.Scanner;

public class Rectangle2 {
	private int width;
	private int height;
	private int area;
	
  public Rectangle2(){input();}
	
		public void printSize() {
			System.out.printf("직사각형의 넓는 "+getSize()+"입니다.\n");
			if(width==height)
				System.out.printf("정사각형입니다.\n");
			else
				System.out.printf("정사각형이 아닙니다.\n");
			
		}	
		
		void input() {
			Scanner s = new Scanner(System.in);
			System.out.println("직사각형의 가로 크기를 입력하시오.");
			this.width = s.nextInt();
			System.out.println("직사각형의 세로 크기를 입력하시.");
			this.height = s.nextInt();
		}	
		double getSize() {
			area = width * height;
			return this.area;
		}	
}

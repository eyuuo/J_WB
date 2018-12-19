package workbook.StepC;

import java.util.Scanner;

public class Rectangle3 {
	private int width;
	private int height;
	
  public Rectangle3(){input();}
	
		public void printSize() {
			if(width==height)
				System.out.printf("정사각형입니다.\n");
			else if(width*2<=height)
				System.out.printf("위 아래로 길쭉한 직사각형입니다.\n");
			else if(width>=height*2)
				System.out.printf("좌우로 길죽한 직사각형입니다.\n");
			else if(width>height)
				System.out.printf("일반적인 가로형 직사각형입니다.\n");
			else if(width<height)
				System.out.printf("일반적인 세로형 직사각형입니다.\n");
			
		}	
		
		void input() {
			Scanner s = new Scanner(System.in);
			System.out.println("직사각형의 가로 크기를 입력하시오.");
			this.width = s.nextInt();
			System.out.println("직사각형의 세로 크기를 입력하시.");
			this.height = s.nextInt();
		}	
}

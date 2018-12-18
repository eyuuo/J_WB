package workbook.StepA2;

import java.util.Scanner;

public class Rectangle {
	
	private int width;
	private int height;
	private int area;
	
  public Rectangle(){input();}
	
		public void printSize() {
			System.out.printf("직사각형의 크기는 "+getSize()+"입니다.");
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



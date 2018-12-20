package workbook.StepD;

import java.util.Scanner;

public class Rectangle4 {
	private int width=1;
	private int height=1;
	private int count1; // "정사각형"의 개수
	private int count2; // "좌우로 길쭉한 직사각형"의 개수
	private int count3; // "위아래로 길쭉한 직사각형"의 개수
	private int count4; // "일반적인 가로형 직사각형"의 개수
	private int count5; // "일반적인 세로형 직사각형"의 개수
  public Rectangle4(){input();}
	
		public void printSize() {
			
				System.out.printf("\"정사각형\"의 개수는 %d입니다.\n",count1);
				System.out.printf("\"위 아래로 길쭉한 직사각형\"의 개수는 %d입니다.\n",count3);
				System.out.printf("\"좌우로 길죽한 직사각형\"의 개수는 %d입니다..\n",count2);
				System.out.printf("\"일반적인 가로형 직사각형\"의 개수는 %d입니다.\n",count4);
				System.out.printf("\"일반적인 세로형 직사각형\"의 개수는 %d입니다.\n",count5);
			
		}	
		
		void input() {
			Scanner s = new Scanner(System.in);
			while(width>0&&height>0) {
				System.out.println("직사각형의 가로 크기와 세로 크기를 입력하시오.");
				this.width = s.nextInt();
				this.height = s.nextInt();
				if(width<=0&&height<=0)break;
				if(width==height)
					count1++;
				else if(width*2<=height)
					count3++;
				else if(width>=height*2)
					count2++;
				else if(width>height)
					count4++;
				else if(width<height)
					count5++;
			}
			
			
		}	
}

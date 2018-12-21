package workbook.StepE;

import java.util.Scanner;

public class Rectangle5 {
	private int length;
	
  public Rectangle5(){input();}
	
		public void printRectangle() {
				for(int i =0;i<length;i++){
					for(int j =0;j<length;j++)
						System.out.printf("# ");
					System.out.printf("\n");
					}
				
			
		}	
		
		void input() {
			Scanner s = new Scanner(System.in);
			
				System.out.println("정사각형의 크기를 입력하시오.");
				this.length = s.nextInt();
		}	
}

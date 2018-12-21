package workbook.StepE;

import java.util.Scanner;

public class Dimensional2Array {
	private int row, columns; //행의 개수,열의 개
	private int number; //각 칸에 출력하는 값 
	
  public Dimensional2Array(){input();}
	
		public void printArray() {
				for(int i =1;i<=row*columns;i++){
					System.out.printf("%5d",i);
					if(i%columns==0)
					System.out.printf("\n");
					}
				
			
		}	
		
		void input() {
			Scanner s = new Scanner(System.in);
			
				System.out.println("출력하려는 행의 크기와 열의 크기를 입력하시오.");
				this.row = s.nextInt(); this.columns = s.nextInt();
		}	
}

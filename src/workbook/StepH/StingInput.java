package workbook.StepH;

import java.util.Scanner;

public class StingInput {
	
	private String input ; // 입력받는 문자열 
	
	public StingInput(){input();}
	
	public void printNum() {
		System.out.printf("\n종료되었습니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("====================\n");
			System.out.printf("=> 문자열을 입력하세요. (x : 종료) : ");
			this.input = s.nextLine();
			if(input.equalsIgnoreCase("X"))break;
			System.out.printf("=> 총 문자의 개수는 %d입니다. \n",input.length());
			for(int i=0;i<input.length();i++)
			System.out.println("=>"+input.charAt(i));
			System.out.printf("\n\n");
			
			
		}
		
	}	

}

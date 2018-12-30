package workbook.StepH;

import java.util.Scanner;

public class StingInput2 {
	
	private String input ; // 입력받는 문자열 
	private String findStr; // 찾을 문자열
	private String replaceStr; // 바꾸고자 하는 문자열

	public StingInput2(){input();}
	
	public void printNum() {
		System.out.printf("\n종료되었습니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true)
		{
		
			System.out.printf("====================\n");
			System.out.printf("=> 문자열을 입력하세요.*영어 (x : 종료) : ");
			this.input = s.nextLine();
			if(input.equalsIgnoreCase("X"))break;
			
			System.out.printf("=> 찾을 문자열을 입력하세요.");
			this.findStr = s.nextLine();
			System.out.printf("=> 바꿀 문자열을 입력하세요.");
			this.replaceStr = s.nextLine();
			
			System.out.printf("\n\n=>총 %d번 바뀌었습니다.\n",findoverlap());
			System.out.println("=>"+input.replace(findStr,replaceStr));
			System.out.printf("\n\n");
			
			
		}
		
	}

	
	
	int findoverlap( ) {
		int lap=0;
		
		
		for(int i=0;i<input.length();i++)
		{
			String input2 = input.substring(i,i+findStr.length());
			if(input2.equals(findStr))
				{lap++;
				if(findStr.length()!=1)
				i=i+findStr.length()-1;
				}
		}
		return lap;
	}

}

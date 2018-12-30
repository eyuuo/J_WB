package workbook.StepH;

import java.util.Scanner;

public class StingInput3 {
	
	private String input; // 입력받는 문자열(사람들 간은 ### 로 구분, 이름과 성별은 |로 구분)
	private String userList[]; // 사용자 리스트
	private String userInfo[]; // 한 사람의 정보
	
	public StingInput3(){input();}
	
	public void printNum() {
		System.out.printf("\n종료되었습니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true)
		{
		
			System.out.printf("====================\n");
			System.out.printf("=> 문자열을 입력하세요.\n*영어, 사람들 간은 ### 로 구분, 이름과 성별은 @로 구분, (x : 종료) : ");
			this.input = s.nextLine();
			if(input.equalsIgnoreCase("X"))break;
			
			System.out.printf("\n=>총 %d명 등록되었습니다.\n",findoverlap( ));
			
			userList= input.split("###");
			for(int i=0;i<findoverlap( );i++) 
			{userInfo = userList[i].split("@"); 
			System.out.printf("%d %s %s\n",i+1,userInfo[0],userInfo[1]);
			}
			System.out.printf("\n\n");
			
			
		}
		
	}


	int findoverlap( ) {
		int lap=0;
		
		
		for(int i=0;i<input.length();i++)
		{
			String input2 = input.substring(i,i+"@".length());
			if(input2.equals("@"))
				lap++;
		}
		return lap;
	}
}

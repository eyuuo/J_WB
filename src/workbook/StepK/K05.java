package workbook.StepK;

import java.util.Scanner;
	
class UserInfo {
	
	private String id,pass; 
	
	void input(){ // 정보를 사용자에게 입력받아 설정하는 메소드
		Scanner s = new Scanner(System.in);
		
		id = s.next();
		pass = s.next();
	
		}
	
	void print(int index){ 

	System.out.printf("%-3d %-10s%-10s\n",index,id,pass);
	}
}
 
public class K05{
	public void main(){
		
		UserInfo ui = new UserInfo();
		System.out.print("학생의 아이디, 비밀번호를 입력하시오 --> ");
		ui.input();
		System.out.print("\n=======================================\n");
		System.out.println("번호 아이디      비밀번호\n");
		ui.print(1);
	}
}
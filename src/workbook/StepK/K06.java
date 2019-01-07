package workbook.StepK;

import java.util.Scanner;
	
public class K06{
	public void main(){
		int number;
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? : ");
		number = s.nextInt();
		UserInfo ui[] = new UserInfo[number];
		for(int i=0;i<number;i++) {
			ui[i] = new UserInfo();
			System.out.printf("%d번 학생의 아이디, 비밀번호를 입력하시오.--> ",i+1);
			ui[i].input();
		}
		System.out.print("\n=======================================\n");
		System.out.println("번호 아이디      비밀번호\n");
		for(int i=0;i<number;i++) {
			ui[i].print(i+1);
		}
			
		
	} 
}
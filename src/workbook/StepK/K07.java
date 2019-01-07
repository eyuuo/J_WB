package workbook.StepK;

import java.util.Scanner;
	
class Student {
	
	private int[] jumsu = new int[3];

	
	void input(){ // 정보를 사용자에게 입력받아 설정하는 메소드
		Scanner s = new Scanner(System.in);
		for(int i =0;i<3;i++)
		this.jumsu[i] = s.nextInt();
		
	
		}
	
	void print(int index){ 
		String ABC = "?";
		float average =(float) ((jumsu[0]+jumsu[1]+jumsu[2])/3.0);
		if(average<60)
			ABC = "F";
		else if(average<70)
			ABC = "D";
		else if(average<80)
			ABC = "C";
		else if(average<90)
			ABC = "B";
		else if(average>=90)
			ABC = "A"; 
		System.out.printf("%-3d %-3d %-3d %-3d %-3d %-5.1f %s\n",index,jumsu[0],jumsu[1],jumsu[2],jumsu[0]+jumsu[1]+jumsu[2],average,ABC);
	}
}

public class K07{
	public void main(){
		int number;
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? : ");
		number = s.nextInt();
		Student sd[] = new Student[number];
		for(int i=0;i<number;i++) {
			sd[i] = new Student();
			System.out.printf("%d번 학생의 국어,영어,수학점수를 입력하시오.--> ",i+1);
			sd[i].input();
		} 
		System.out.print("\n=======================================\n");
		System.out.println("번호 국어 영어 수학 총점  평균  학점\n");
		for(int i=0;i<number;i++) {
			sd[i].print(i+1);
		}
	}
}
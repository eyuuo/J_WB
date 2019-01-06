package workbook.StepJ;

import java.util.Scanner;

public class Poweroftwo {
	
	private int num;
	
	public Poweroftwo(){input();}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하시오.(0:종료)");
			num = s.nextInt();
			if(num==0) break;
			System.out.printf("2의 %d승은 :  %d\n",num,poweroftwo(num));
		}
			
	}
	
	int poweroftwo(int n)  {
		if(n==0) return 1;
		if(n>0) return (2*poweroftwo(n-1));
		return 0;
	}
	
}

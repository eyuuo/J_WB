package workbook.StepD;
import java.util.Scanner;

public class ExclusiveMul {
	private int num1,num2,i;
	
	public ExclusiveMul() {input();}
	
	public void printEx() {
		for(i=1;i<=100;i++) {
			if(num1*i>100||num2*i>100)	break;			
			if((num1*i)%num2!=0){
				System.out.print(num1*i+","+num2*i+",");
			}
		}
		System.out.print("\n");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("2개의 숫자를 입력하시오.");
		num1 = s.nextInt();
		num2 = s.nextInt();
	}


}

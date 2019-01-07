package workbook.StepK;

import java.util.Scanner;
	
public class K04{
	private int[] N = new int[4]; //1,2,3,4분면 개수
	private int num;
	
	public void main(){
	
		Scanner s = new Scanner(System.in);
		System.out.print("몇 개의 좌표를 입력하시겠습니까?");
		this.num = s.nextInt();
		Point pt[] = new Point[num];
		
		for(int i=0;i<num;i++) {
			pt[i] = new Point();
			System.out.printf("%d번째 좌표의 X, Y 값을 입력하시오 -->",i+1);
			pt[i].input();
		}
		System.out.print("\n=======================================\n");
	 	
		for(int i=0;i<num;i++) {
			System.out.printf("%d번째 좌표는 %d사분면에 위치합니다.\n",i+1,pt[i].print_area());
			if(pt[i].print_area()==1) this.N[0]++;
			if(pt[i].print_area()==2) this.N[1]++;
			if(pt[i].print_area()==3) this.N[2]++;
			if(pt[i].print_area()==4) this.N[3]++;
		}
		
		for(int i=1;i<=4;i++) System.out.printf("%d사분면의 좌표는 모두 %d개 입니다.\n",i,N[i-1]);
	}
}
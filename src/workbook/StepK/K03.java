package workbook.StepK;

import java.util.Scanner;
	
class Point {
	 private double x,y;
	
	void input(){ // 정보를 사용자에게 입력받아 설정하는 메소드
		Scanner s = new Scanner(System.in);
		x = s.nextDouble();
		y = s.nextDouble();
		}

	int print_area() {
		int area = get_area(x, y);
		return area;
	}
	
	int get_area(double x, double y) {
		if(x==0&&y==0) return 0;
		if(x>0&&y>0) return 1;
		if(x<0&&y>0) return 2;
		if(x<0&&y<0) return 3; 
		if(x>0&&y<0) return 4;
		return 0;
	}
}

public class K03{
	private int[] N = new int[4]; //1,2,3,4분면 개수
	public void main(){
		
		Point pt = new Point();
		System.out.print("좌표의 X, Y 값을 입력하시오 -->");
		pt.input();
		System.out.print("\n=======================================\n");
		System.out.printf("1번째 좌표는 %d사분면에 위치합니다.\n",pt.print_area());
		if(pt.print_area()==1) this.N[0]++;
		if(pt.print_area()==2) this.N[1]++;
		if(pt.print_area()==3) this.N[2]++;
		if(pt.print_area()==4) this.N[3]++;
				
		for(int i=1;i<=4;i++) System.out.printf("%d사분면의 좌표는 모두 %d개 입니다.\n",i,N[i-1]);
		
	}
}
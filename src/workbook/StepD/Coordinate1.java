package workbook.StepD;
import java.util.Scanner;

public class Coordinate1 {
	private int a,b;
	private int x_begin,x_end;
	private int x,y;
 
	public Coordinate1() {input();}
	
	public void printCoor() {
		for(int i=x_begin;i<=x_end;i++) {
			y=a*i+b;
			x=i;
			System.out.println("좌표 ("+x+","+y+")");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("1차 함수 y=ax+b의 계수 a와 b를 입력하세요.");
		this.a = s.nextInt(); this.b = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.");
	this.x_begin = s.nextInt(); this.x_end = s.nextInt();
	}
}

package workbook.StepF;

import java.util.Scanner;

public class Apartment6 {
	private int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트
	private int newnum; // 입력받은 숫자
	private int floor_total[] = new int[5]; // 층별 거주자 합계 리스트 (1층, 2층, 3층, 4층, 5층)
	private int line_total[] = new int[3]; // 호수별 거주자 합계 리스트 (1호라인, 2호라인, 3호라인)
	private int total; // 아파트의 총 거주자 수
	private int ho; // 아파트 호를 나타내는 변수	
	
	public Apartment6(){input();}
	public void printArea() {
		for(int i=0;i<5;i++)
			System.out.printf("%d층에 사는 거주자는 모두 %d명입니다.\n",i+1,floor_total[i]);
		System.out.printf("\n");
		for(int i=0;i<3;i++)
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명입니다.\n",i+1,line_total[i]);
		System.out.printf("\n");
			System.out.printf("이 아파트에 사는 거주자는 모두 %d명입니다.\n",total);
	}	
	
	void input() {
		int i, j; // 반복문 사용을 위한 변수
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++){
				System.out.printf("%d0%d호에 살고 있는 사람의 숫자를 입력하시오.",i+1,j+1);
				this.number[i][j] = s.nextInt();
				total = total+number[i][j];
				floor_total[i]=floor_total[i]+number[i][j];
				line_total[j]=line_total[j]+number[i][j];
				}	
		}
			
	}	
}

package workbook.StepJ;

import java.util.Scanner;

public class Temperature5 {
	
	private double input_degree; // 입력받은 온도
	private double degrees[] = new double[10]; // 온도 리스트
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	private int count[] = {0,0,0,0}; 
	// 입력 횟수 목록 (순서대로 냉수 입력 횟수, 미온수 입력 횟수, 온수 입력 횟수, 끓는 물 입력 횟수)
	private int sel; // 온도 판정 번호 (0,1,2,3)
	
	public Temperature5(){input();}
	
	public void printTemper() {
		for(int i=0;i<10;i++) 
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.  \n",i+1,degrees[i]);
		
		for(int i=0;i<4;i++) 
			System.out.printf("%s 입력 횟수 : %d\n",degree_name[i],count[i]);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d번 물의 온도를 입력하시오.",i+1);
			this.degrees[i] = s.nextDouble();	
			this.count[AskWater(degrees[i])]++;
			
		}
		
	}	
	
	byte AskWater(double degree) {

		if(degree<25)
			return 0;
		else if(degree<40)
			return 1;
		else if(degree<80)
			return 2;
		else if(degree>=80)
			return 3;
		return 0;
	}

}

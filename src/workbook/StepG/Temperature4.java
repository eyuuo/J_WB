package workbook.StepG;

import java.util.Scanner;

public class Temperature4 {
	
	private double input_degree; // 입력받은 온도
	private double degrees[] = new double[10]; // 온도 리스트
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	private int count[] = {0,0,0,0}; 
	// 입력 횟수 목록 (순서대로 냉수 입력 횟수, 미온수 입력 횟수, 온수 입력 횟수, 끓는 물 입력 횟수)
	private int sel; // 온도 판정 번호 (0,1,2,3)
	
	public Temperature4(){input();}
	
	public void printTemper() {
		for(int i=0;i<10;i++) {
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.  ",i+1,degrees[i]);
			input_degree=degrees[i];
			if(input_degree<25)
				System.out.printf("냉수\n");
			else if(input_degree<40)
				System.out.printf("미온수\n");
			else if(input_degree<80)
				System.out.printf("온수\n");
			else if(input_degree>=80)
				System.out.printf("끓는 물\n");
		}
		for(int i=0;i<4;i++) 
			System.out.printf("%s 입력 횟수 : %d\n",degree_name[i],count[i]);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("%d번 물의 온도를 입력하시오.",i+1);
			this.degrees[i] = s.nextDouble();	
			if(degrees[i]<0){
				System.out.printf("잘못입력하셨습니다.\n");
				i--;
				}
			else if(degrees[i]<25)
				count[0]++;
			else if(degrees[i]<40)
				count[1]++;
			else if(degrees[i]<80)
				count[2]++;
			else if(degrees[i]>=80)
				count[3]++;
		}
		
	}	

}

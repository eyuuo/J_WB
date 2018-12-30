package workbook.StepH;

import java.util.Scanner;

public class SquarePower {

	private int number[] = new int[5]; // 입력받은 5개의 숫자 리스트
	private int pow_value[][] = new int[5][5]; 
	//임의의 두 수 a, b로 만들 수 있는 a b의 값 들, 5 * 5 리스트
	private int max, min; // 최댓값과 최솟값
	private int max_a, max_b; // 최댓값을 만들어 내는 경우의 a와 b의 값
	private int min_a, min_b; // 최솟값을 만들어 내는 경우의 a와 b의 값
	
	public SquarePower(){input();}
	
	public void printNum() {
		System.out.printf("입력하신 5개의 수로 제곱수를 만들면....\n");
		System.out.printf("가장 큰 수는 %d의 %d승인 %d 입니다.\n",number[max_a],number[max_b],pow_value[max_a][max_b]);
		System.out.printf("가장 작 수는 %d의 %d승인 %d 입니다.\n",number[min_a],number[min_b],pow_value[min_a][min_b]);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("2에서 9사이의 숫자 5개를 입력하세요.");
			
			for(int i=0;i<5;i++)
				this.number[i] = s.nextInt();
			max=(int)Math.pow(number[0],number[1]);
			min =(int)Math.pow(number[0],number[1]);
			
			
			for(int i=0;i<5;i++)
				for(int j=0;j<5;j++) {
					pow_value[i][j] = (int)Math.pow(number[i],number[j]);
					
					if(i!=j) {
						if(max<=pow_value[i][j]) {
							max= (int) pow_value[i][j]; 
							max_a=i; max_b=j;
						}
						
						if(min>=pow_value[i][j]) {
							min= (int) pow_value[i][j]; 
							min_a=i; min_b=j;
						}
					}
					
					
				}

		
	}	

}

package workbook.StepG;

import java.util.Scanner;

public class AmusementparkFee {
	private int team_count; // 방문한 팀수
	private int charge[] = {5000, 10000, 15000, 3000};// 연령별 수
	private int count[] = new int[4]; // 입력받은 연령별 인원 수
	private int v_count[] = new int[4]; // 연령별 방문자 합계
	private int total_count = 0; // 총 방문자 수
	private int sum; // 팀별 계산한 요금
	private int total_sum =0; // 총 요금
	private int membership = 0; // 할인카드 종류(카드없음:0, 일반등급 카드 : 1, VIP 등급 카드 : 2)
	
	public AmusementparkFee(){input();}
	
	public void printFee() {
		String name[] = {"초등학생","청소년","일반인","경로대상"};
		System.out.printf("\n오늘 총 방문자 수는 %d명 입니다.\n",total_count);
		
		for(int i=0;i<4;i++) 
			System.out.printf("%s 는 %d명 입니다.\n",name[i],v_count[i]);
		
		System.out.printf("\n총액은 %d원입니다.\n",total_sum);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("오늘 방문한 팀 수를 입력하세요.\n");
		this.team_count = s.nextInt();
		
			for(int i=0;i<team_count;i++) {
				System.out.printf("%d번팀 인원수(초등학생,청소년,일반,경로대상)를 입력하세요. ",i+1);
				for(int j=0;j<4;j++) {
					this.count[j]= s.nextInt();
					this.v_count[j] = v_count[j]+count[j];
					this.total_count = total_count +count[j];
				}
				
				System.out.printf("%d번팀 할인카드 종류(카드없음:0, 일반등급:1, VIP 등급 :2)를 입력하세요. ",i+1);
				this. membership = s.nextInt();
				this.sum= charge[0]*count[0]+charge[1]*count[1]+charge[2]*count[2]+charge[3]*count[3];
				if(membership==1)
					sum= sum -(sum/10);
				else if(membership==2)
					sum= sum -(sum/5);
				total_sum = total_sum+sum;
				System.out.printf("판매금액은 %d원입니다.\n",sum);
				
			}
			
			
		}
	

}

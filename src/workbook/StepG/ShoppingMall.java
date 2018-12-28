package workbook.StepG;

import java.util.Scanner;

public class ShoppingMall {
	private int order[] = {0,0,0}; // 입력받는 구매 제품 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
	private int sale; // 계산한 판매금액
	private int total_sale=0; // 총 매출액 총액
	private int total_order[] = {0,0,0}; // 총 판매 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
	private int price[] = {10000, 6000, 3000}; // 제품별 가격
	
	public ShoppingMall(){input();}
	
	public void printFee() {
		System.out.printf("\n지금까지의 총액은 %d원입니다.\n",total_sale);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("세 종류의 제품이 있습니다.\n(1.가죽장갑 1만원, 2.털장갑 6천원, 3.비닐장갑 3천원)\n\n");
		
		while(true) {
			for(int i=0;i<3;i++) {
				System.out.printf("%d번 제품 구입개수는? ",i+1);
				this.order[i]= s.nextInt();
				this.total_order[i] = total_order[i]+order[i];
			}
			if(order[0]==0&&order[1]==0&&order[2]==0)break;
			this.sale=order[0]*price[0]+order[1]*price[1]+order[2]*price[2];
			this.total_sale=total_sale+sale;
			System.out.printf("판매금액은 %d원입니다.\n\n",sale);
			
		}
	}	

}

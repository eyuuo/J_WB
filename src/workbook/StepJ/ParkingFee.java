package workbook.StepJ;

import java.util.Scanner;

public class ParkingFee {
	private int s_hour, s_minute, e_hour, e_minute; // 이용한 시간, 분
	private int charge; // 이용료
	private int total_charge; // 이용료 총액
	private String onemore = "Y";
	public ParkingFee(){input();}
	
	public void printFee() {
		System.out.printf("\n지금까지의 이용료 총액은 %d원입니다.\n",total_charge);
	}	
	
	void input() {
		int i=1;
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("%d번 차량 주차 시작 시각(시 ) : ",i);
			this.s_hour= s.nextInt()*60;
			this.s_minute = s.nextInt();
			System.out.printf("%d번 차량 주차 종 시각(시 ) : ",i);
			this.e_hour= s.nextInt()*60;
			this.e_minute = s.nextInt();
			i++;
			
			this.charge = CalcParking(s_hour, s_minute, e_hour, e_minute);
			this.total_charge = total_charge+charge;
			System.out.printf("주차요금 : %d원\n",charge);
			System.out.printf("더 입력하시겠습니까?(Y/N)");
			onemore = s.next();
			
			if(onemore.equalsIgnoreCase("N")) break;
			
		}
	}
	
	int CalcParking(int start_h, int start_m, int end_h, int end_m) {
		int charge = ((end_h+end_m)-(start_h+start_m));
		if(charge%10==0) charge=(charge/10)*500;
		else charge=(charge/10)*500+500;
		return charge;
	}

}

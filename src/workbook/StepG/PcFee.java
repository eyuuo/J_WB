package workbook.StepG;

import java.util.Scanner;

public class PcFee {
	private int hour, minute; // 이용한 시간, 분
	private int charge; // 이용료
	private int total_charge; // 이용료 총액
	
	public PcFee(){input();}
	
	public void printFee() {
		System.out.printf("\n지금까지의 이용료 총액은 %d원입니다.\n",total_charge);
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("사용한 시간을 시간과 분으로 입력하세요 : ");
			this.hour= s.nextInt()*60;
			this.minute = s.nextInt();
			if(hour==0&&minute==0)break;
			if(minute%30!=0)
				this.charge = (((hour+minute)/30)+1)*1000;
			if(minute%30==0)
				this.charge = ((hour+minute)/30)*1000;
			
			if((hour+minute)>=120&&(hour+minute)<180) this.charge=charge-((charge/100)*5);
			else if((hour+minute)>=180&&(hour+minute)<300)this.charge=charge-(charge/10);
			else if((hour+minute)>300)this.charge=charge-((charge/100)*20);
			
			System.out.printf("고갹님의 이용료는 %d원입니다.\n",charge);
			this.total_charge = total_charge+charge;
		}
	}	

}

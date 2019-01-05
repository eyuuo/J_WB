package workbook.StepH;
import java.util.Random;
import java.util.Scanner;

public class LottoNumber2 {
	Random generator = new Random();
	
	private int lotto_com[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트
	private int lotto_user[] = new int[6]; // 사용자가 입력한 로또 번호 리스트
	private int count=0; // 현재 만들어지고 있는 로또 번호의 순서(0, 1, 2, 3, 4, 5)
	private int match_count=0; // 일치하는 로또 번호의 갯수 (0~6)
	
	public LottoNumber2(){input();}
	
	public void printNum() {
	
		System.out.printf("이번 주의 로또 당첨 번호는 ");
		for(int i=0;i<6;i++) 
			System.out.printf("%d ",lotto_com[i]);
		System.out.printf(" 입니다.\n");
		
		System.out.printf("일치하는 로또 번호는 %d개 입니다.\n", match_count);
	
	}	

	
	void input() {
		Scanner s = new Scanner(System.in);
	
		getLotto_com();
		
		while(true){
			if(count==6)break;
			System.out.printf("원하는 %d번째 로또 숫자를 입력하세요. ",count+1);
			this.lotto_user[count] = s.nextInt();
			for(int i=0;i<count;i++)
			if(lotto_user[count]==lotto_user[i]) {
				System.out.printf("=> 잘못입력하셨습니다.\n");
				this.count--;
				break;
			}	
			getSame(count);
			this.count++;
		}	

	}
	
	int[] getLotto_com() {
		for(int i=0;i<6;i++) {
			this.lotto_com[i] = generator.nextInt(45) + 1;
			for(int j = 0; j<i; j++)
				if(lotto_com[i]==lotto_com[j]) 
					i--;     }
		
		return this.lotto_com;
	}
	
	int getSame(int count) {
		for(int i=0;i<6;i++) {
			if(lotto_user[count]==lotto_com[i])
				this.match_count++;
		}
		return this.match_count;
	}
	
	
}

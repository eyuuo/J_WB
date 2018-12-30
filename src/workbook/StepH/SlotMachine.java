package workbook.StepH;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
	Random generator = new Random();
	
	private int coins; // 사용자의 코인 수. (최초에 입력받음)
	private int number[] = {0,1,2}; // 랜덤하게 만들어진 슬롯 머신의 숫자 3개의 리스트
	private int dummy; // 게임스타트를 위한 의미 없는 입력 숫자
	
	public SlotMachine(){input();}
	
	public void printSlot() {
		System.out.printf("\n\n게임 종료!!\n\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);

				System.out.printf("사용하실 코인의 개수를 입력하세요.");
				this.coins = s.nextInt();
				int i=1;
				
				while(true){
					if(coins ==0) break;
					
					System.out.printf("게임 %d회 Start!! (아무 숫자나 입력하세요.)",i);
					i++;
					this.dummy = s.nextInt(); 
					
					System.out.printf("게임 결과  :  ");
					
					for(int j=0;j<3;j++) {
						this.number[j] = generator.nextInt(9) + 1;
						System.out.printf("%d ",number[j]);
					} 
					
					System.out.printf("--->");
					
					if(number[0]==number[1]&&number[1]==number[2]) { System.out.printf("숫자 3개 일치!... 코인4개 증정.\n"); coins = coins +4; }
					else if(number[0]==number[1]||number[0]==number[2]||number[1]==number[2]) { System.out.printf("숫자 2개 일치!... 코인2개 증정.\n"); coins = coins +2; }
					else System.out.printf("꽝입니다... 아쉽군요.\n");  
					coins --;
					System.out.printf("남아있는 코인은 %d개 입니다.\n",coins);
				}
				
			}


}



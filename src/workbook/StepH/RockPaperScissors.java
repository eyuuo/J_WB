package workbook.StepH;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	Random generator = new Random();
	
	private int com_finger; // 컴퓨터가 낸 가위(1), 바위(2), 보(3)
	int my_finger; //사용자가 낸 가위(1), 바위(2), 보(3)
	int score[][] = new int[2][3];//결과 횟수 리스트 [[컴퓨터의 승, 무, 패], [사용자의 승, 무, 패]]
	
	public RockPaperScissors(){input();}
	
	public void printResult() {
		System.out.printf("\n컴퓨터 : 이긴 횟수는 %d회, 진 횟수 %d회,비긴 횟수 %d회 입니다.",score[0][0],score[0][2],score[0][1]);
		System.out.printf("\n사용 : 이긴 횟수는 %d회, 진 횟수 %d회,비긴 횟수 %d회 입니다.\n",score[1][0],score[1][2],score[1][1]);
		
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		
			while(true) {
				this.com_finger = generator.nextInt(3) + 1;
				System.out.printf("가위(1), 바위(2), 보(3)를 입력하세요.");
				this.my_finger = s.nextInt();
				
				if(my_finger == 0) break;
				
				if(com_finger==1) System.out.printf("컴퓨터가 낸 것은 가위입니다. ---->");
				if(com_finger==2) System.out.printf("컴퓨터가 낸 것은 바위입니다. ---->");
				if(com_finger==3) System.out.printf("컴퓨터가 낸 것은 보입니다. ---->");
				
				if(my_finger==com_finger) {
					System.out.printf("비김.\n"); 
					this.score[0][1]++; this.score[1][1]++;
					}
				else if(my_finger-com_finger==1||my_finger-com_finger==-2) { 
					System.out.printf("이김.\n");
					this.score[0][2]++; this.score[1][0]++;
					}
				else { 
					System.out.printf("짐.\n"); 
					this.score[0][0]++; this.score[1][2]++;
					}
				}
				
				
				
			}
			
			
			
		
		

}

//1 가위 2 바위  3 보 
//이김 : 가위 보 1,3/, 보 바위 3,2/, 바위 가위.2,1 빼기 : -2,1,1

//짐 : 3,1/2,3/1,2 빼기 2,-1,-1




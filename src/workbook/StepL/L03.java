package workbook.StepL;
import java.util.*; 
import java.text.SimpleDateFormat;

class Menupan3{
	
	private int num[]= {0,0,0,0}; // 번호,이름
	private String membership,time; 
	private int total,people,N;

	Menupan3(int p, int[] m, String n, String t, int tt){

		this.people = p;
		for(int i=0; i<3;i++)
		this.num[i] = m[i];
		this.membership = n;
		this.time = t;
		this.total = tt;
		}
	
	void print(){ 
		System.out.printf("%-7d%-7d%-7d%-7d%-7s%s\n",people,num[0],num[1],num[2],membership,time);
		}
	void print2(){ 
		System.out.printf("%-7d%-7d%-7d%-7s%-7s%-7d%s\n",people,num[0],num[1],num[2],membership,total,time);
		}

}


public class L03{
	
	private int num[]= {0,0,0}; // 번호,이름
	private String membership,time; 
	private int people,choice,total;
	private int money[] = {25000,15000,17000};
	
	ArrayList<Menupan3> u = new ArrayList<Menupan3>() ;

	
	String getTime() {
		
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm", Locale.KOREA);
		String time= f.format(new Date());
		
		return time;
	}
	
	public void main(){
	
		Scanner s = new Scanner(System.in);
		int p=1,N;
		while(true){
			
			System.out.print("------------------------------\n");
			System.out.print("1) 주문 2) 결제 3)리스트 4)종료 ==> ");
			this.choice = s.nextInt();
			System.out.print("------------------------------\n");
			
			if(choice==4) break;
			if(choice==1) {
				System.out.print("손님 수를 입력하세요 : ");
				this.people = s.nextInt();
				System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요 : ");
				for(int i=0; i<3;i++) {
					this.num[i] = s.nextInt();
					
				}
					
				System.out.print("멤버쉽 카드가 있습니까?(Y:있음) ");
				this.membership = s.next();
				
				System.out.print("들어오신 시간은 ");
				this.time = getTime();
				System.out.print(time+"입니다.\n");
				
				for(int i=0; i<3;i++) 
					total = total+(money[i]*num[i]);
				
				if(membership.equalsIgnoreCase("Y"))
					total = total-(total/10);
				if(total<100000)	
					total = total+(total/100*7);
				else
					total = total+(total/10);
				
				total = total+(total/10);
					
				System.out.printf("총금액은 %d원 입니다.\n ",total);
				System.out.print("\n");
				u.add(new Menupan3(people,num,membership,time,total)); //요소 추가
				p++;
			}
			if(choice==2) {
				System.out.print("번호 손님수   스테이크  스파게티  파스타 멤버쉽   결제금액  입장시간\n");
				for(int I=0; I < u.size(); I++){ //요소의 개수를 가져옴
					System.out.printf("[%d]",I+1);
					u.get(I).print2();
				}
				
				System.out.print("==> 결제하실 번호를 입력하세요. :");
				N=s.nextInt();
				u.remove(N-1); 
				p--;
				System.out.print("==> 결제가 완료되었습니다\n\n.");
			}
			if(choice==3) {
				System.out.print("번호 손님수  스테이크  스파게티  파스타  멤버쉽  입장시간\n");
				for(int I=0; I < u.size(); I++){ //요소의 개수를 가져옴
					System.out.printf("[%d]",I+1);
					u.get(I).print();
				}
			System.out.print("\n\n");
				
			}
		}//while
	}
}
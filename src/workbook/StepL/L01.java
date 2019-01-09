package workbook.StepL;
import java.util.*; //ArrayList 클래스와 Scanner 사용하기 위한 패키지


class Menupan1{
	private int money; // 번호,이름
	private String origin,name; 
	
	Menupan1(String n, String o, int m){
		this.name = n;
		this.origin = o;
		this.money = m;
		}
	
	void print(){ 
		System.out.printf("%-10s%-10s%-10d\n",name,origin,money);
		}
}


public class L01{
	
	private int choice;
	private int money,num; // 번호,이름
	private String origin,name;
	
	ArrayList<Menupan1> u = new ArrayList<Menupan1>() ;
	
	void show() {
		int i=1;
		System.out.print("메뉴번호    메뉴이름    원산지      1인분 가격\n");
		for(int I=0; I < u.size(); I++){ //요소의 개수를 가져옴
			System.out.printf("%-10d",i);
			u.get(I).print();
			i++;
		}
	}
	
	public void main(){
		
		Scanner s = new Scanner(System.in);
		
		
		while(true){
			
			System.out.print("1) 추가 2) 수정 3) 삭제 4)리스트 5)총개수 6)종료 ==> ");
			this.choice = s.nextInt();
			System.out.print("------------------------------\n");
			if(choice==6) break;
			if(choice==1) {
				System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
				this.name = s.next();
				this.origin = s.next();
				this.money = s.nextInt();
				System.out.print("\n");
				u.add(new Menupan1(name, origin, money)); //요소 추가
			}
			if(choice==2) {
				show();
				System.out.print("==> 수정할 번호 :");
				num=s.nextInt();
				
				System.out.print("==> 메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
				this.name = s.next();
				this.origin = s.next();
				this.money = s.nextInt();
				
				u.add(num-1,new Menupan1(name, origin, money));
				u.remove(num);
				System.out.print("\n");
			}
			if(choice==3) {
				show();
				System.out.print("==> 삭제할 번호 :");
				num= s.nextInt();
				u.remove(num-1);
				System.out.print("삭제되었습니다.\n\n");
			}
			if(choice==4) {
				show();
			}
			if(choice==5) {
				System.out.printf("%d개의 메뉴가 등록되었습니다.\n\n",u.size());
			}
				
		}
		
	
		
	}
}
package workbook.StepL;

import java.util.*; 
import java.util.Date;
import java.text.SimpleDateFormat;


class Parking{
	
	private int c_number; // 번호,이름
	private String name, time; 
	private int s_hour, s_minute;
	
	Parking( int m, String n , String t,int s_hour, int s_minute){
	
		this.name = n;
		this.c_number = m;
		this.time = t;
		this.s_hour = s_hour;
		this.s_minute = s_minute; 
		}
	
	int CalcFee(int end_h, int end_m) {
		int charge = ((end_h*60+end_m)-(this.s_hour*60+this.s_minute));
		if(charge%10==0) charge=(charge/10)*500;
		else charge=(charge/10)*500+500;
		return charge;
	}
	
	void print(){ 
		System.out.printf(" %d %s %s",c_number,name,time);
		}
}


public class L02{
	
	private int choice, car_num,num;
	private int c_number; // 번호,이름
	private String name; 
	
	private int s_hour, s_minute, e_hour, e_minute;
	
	
	ArrayList<Parking> u = new ArrayList<Parking>() ;
	
	void show() {
		int i=1;
		for(int I=0; I < u.size(); I++){ //요소의 개수를 가져옴
			System.out.printf("[%d] ",i);
			u.get(I).print();
			System.out.println();
			i++;
		}
	}

	String[] getTime() {
		
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm", Locale.KOREA);
		SimpleDateFormat f0 = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분", Locale.KOREA);
		SimpleDateFormat f1 = new SimpleDateFormat("hh", Locale.KOREA);
		SimpleDateFormat f2 = new SimpleDateFormat("mm", Locale.KOREA);
		
		String[] time = new String[4];
		time[1]= f0.format(new Date());
		time[0]= f.format(new Date());
		time[2]= f1.format(new Date());
		time[3]= f2.format(new Date());
		
		return time;
	}
	
	
	
	
	public void main(){
		
		int j=1,total;
		String[] time = new String[4] ; 
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("주차할 수 있는 차의 개수를 입력하세요 :");
		this.car_num = s.nextInt();
		
		while(true){
			System.out.print("\n-------------------------------------------\n");
			System.out.print("1) 입차 2) 출차 3) 리스트 4)입차 총개수 5)주차잔여개수 6)종료 ==> ");
			System.out.print("-------------------------------------------\n");
			
	
			if(choice==6) break;
			if(choice==1) {
				System.out.print("입차할 차의 번호와 차종을 입력하세요.");
				
				this.c_number= s.nextInt();
				this.name = s.next();
				
				time = getTime();
				this.s_hour = Integer.parseInt(time[2]);
				this.s_minute = Integer.parseInt(time[3]);
		
				System.out.printf("[%d]"+time[1]+" 입차 되었습니다.\n",j);
				
				u.add(new Parking(c_number,name, time[0],this.s_hour,this.s_minute)); //요소 추가
				j++;
			}
			if(choice==2) {
				j--;
				show();
				System.out.print("==> 출차 번호를 입력하세요 :");
				num=s.nextInt();
				
				time = getTime();
				this.e_hour = Integer.parseInt(time[2]);
				this.e_minute = Integer.parseInt(time[3]);
				
				total=u.get(num-1).CalcFee(this.e_hour,this.e_minute);
				
				SimpleDateFormat f2 = new SimpleDateFormat("현재 시간은 [YYYYMMdd hh: mm]이므로 주차금액은 ", Locale.KOREA);
				String time3 = f2.format(new Date());
				System.out.print(time3 + "주차금액은 "+total+"원입니다.");
				u.remove(num-1);
				System.out.print("정산되었습니다..\n\n");
				
				System.out.print("\n");
			}
			if(choice==3) {
				show();
				System.out.printf("%d대 주차가능 입니다.\n\n",this.car_num-u.size());
				
			}
			if(choice==4) {
				
				System.out.printf("총 %d대 주차되어있습니다.\n\n",u.size());
				
				show();
				 
			}
			if(choice==5) {
				System.out.printf("주차 가능한 자리는 %d대 입니다.\n\n",car_num-u.size());
			}
				
		}
		
	
		
	}
}
package workbook.StepL;
import java.util.*; 
import java.text.SimpleDateFormat;

class Student{
	
	private int num;
	private String name,sex,address,phon,re; 

	Student(String name, int num, String sex, String address,String phon,String re){

		this.name = name;
		this.num = num;
		this.sex= sex;
		this.address= address;
		this.phon= phon;
		this.re= re;
		
		}
	
	void getName(String n) {
		int lap=0;
		for(int i=0;i<name.length();i++)
		{
			String input2 = name.substring(i,i+n.length());
			if(input2.equals(n))
				{lap++;
				if(n.length()!=1)
				i=i+n.length()-1;
				}
		}
		if(lap>0)
			System.out.printf("%-7s%-7d%-7s%-7s%-7s%-7s \n",name,num,sex,address,phon,re);
		else if(lap==0)System.out.println(".");
		System.out.println(".");
	}
	void getAdd(String n) {
		int lap=0;
		for(int i=0;i<address.length();i++)
		{
			String input2 = address.substring(i,i+n.length());
			if(input2.equals(n))
				{lap++;
				if(n.length()!=1)
				i=i+n.length()-1;
				}
		}
		if(lap>0)
			System.out.printf("%-7s%-7d%-7s%-7s%-7s%-7s \n",name,num,sex,address,phon,re);
		else if(lap==0)System.out.println(".");
		System.out.println(".");
	}
	
	void getRe() {
		if(re.equalsIgnoreCase("Y"))
			System.out.printf("%-7s%-7d%-7s%-7s%-7s%-7s \n",name,num,sex,address,phon,re);
	}
	void print(){ 
		System.out.printf("%-7s%-7d%-7s%-7s%-7s%-7s \n",name,num,sex,address,phon,re);
	}
	
}


public class L04{
	
	private int num,choice;
	private String name,sex,adress,phon,re; 
	private String searching;
	ArrayList<Student> u = new ArrayList<Student>() ;

	
	String getTime() {
		
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm", Locale.KOREA);
		String time= f.format(new Date());
		
		return time;
	}
	
	void show() {

		for(int I=0; I < u.size(); I++){ //요소의 개수를 가져옴
			u.get(I).print();
			System.out.println();
		}
	}
	
	public void main(){
	
		Scanner s = new Scanner(System.in);
		int N=0;
		String YN;
		while(true){
			
			System.out.print("--------------------------------------------\n");
			System.out.print("1) 학생등록 2) 정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==>");
			this.choice = s.nextInt();
			System.out.print("--------------------------------------------\n");
			
			if(choice==8) break;
			if(choice==1) {
				System.out.print("학생이름, 학번, 성별을 입력하세요  : ");
				this.name = s.next();
				this.num = s.nextInt();
				this.sex= s.next();
				
				System.out.print("주소를 입력하세요 : ");
				this.adress = s.next();
				
				System.out.print("전화번호를 입력하세요.: ");
				this.phon =s.next();
				System.out.print("복학생이십니까? : ");
				this.re= s.next();
				
				System.out.print("\n");
				u.add(new Student(name,num,sex,adress,phon,re)); //요소 추가
			
			}
			if(choice==2) {
				System.out.print("이름   학번   성별    주소   전화번호   복학생\n");
				show();
				System.out.print("==> 수정하실 순서번호를 입력하시오. :");
				N=s.nextInt();
				
				System.out.print("학생이름, 학번, 성별을 입력하세요  : ");
				this.name = s.next();
				this.num = s.nextInt();
				this.sex= s.next();
				System.out.print("주소를 입력하세요 : ");
				this.adress = s.next();
				System.out.print("전화번호를 입력하세요.: ");
				this.phon =s.next();
				System.out.print("복학생이십니까? : ");
				this.re= s.next();
				System.out.print("수정되었습니다.\n.");
				System.out.print("\n");
				u.add(N-1,new Student(name,num,sex,adress,phon,re)); //요소 추가
				u.remove(N);
				
				
			}
			if(choice==3) {
				System.out.print("이름   학번   성별    주소   전화번호   복학생\n");
				show();
				System.out.print("==> 삭제하실 번호를 입력하시오. :");
				N=s.nextInt();
				System.out.print("정말로 삭제?(Y/N)\n.");
				YN = s.next();
				if(YN.equalsIgnoreCase("Y"))
				u.remove(N-1); 
				System.out.print("삭제되었습니다.\n.");
			System.out.print("\n\n");
				
			}
			if(choice==4) {
				System.out.print("이름   학번   성별    주소   전화번호   복학생\n");
				show();
				System.out.printf("총 %d명이 등록되었습니다.\n\n",u.size());
				
			}
			if(choice==5) {
				System.out.print("검색하실 이름을 입력하세요.\n");
				searching = s.next();
				System.out.print("이름   학번   성별    주소   전화번호   복학생\n");
				for(int I=0; I < u.size(); I++)
					u.get(I).getName(searching);

			}
			if(choice==6) {
				System.out.print("이름   학번   성별    주소   전화번호   복학생\n");
				for(int I=0; I < u.size(); I++)
					u.get(I).getRe();
				
				
			}
			if(choice==7) {
				System.out.print("검색하실 주소을 입력하세요.\n");
				searching = s.next();
				System.out.print("이름   학번   성별    주소   전화번호   복학생\n");
				
				for(int I=0; I < u.size(); I++)
					u.get(I).getAdd(searching);
				
				
			}
		}//while
	}
}
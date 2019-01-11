package workbook.StepM;
import java.util.*; //ArrayList 클래스와 Scanner 사용하기 위한 패키지
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;

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
	String forFile(){  
		String S = name+" "+origin+" "+money+"\n";
	return 	S;
			
	}
}


public class M01{
	
	private int choice;
	private int money,num; // 번호,이름
	private String origin,name;
	
	ArrayList<Menupan1> u = new ArrayList<Menupan1>() ;
	
	void show() {
		int i=1;
		for(int I=0; I < u.size(); I++){ //요소의 개수를 가져옴
			System.out.printf("%-10d",i);
			u.get(I).print();
			i++;
		}
	}
	
	public void main(){
		
		Scanner s = new Scanner(System.in);
		String fileName = "/Users/eyuuo/Desktop/java/src/workbook/StepM/save.txt" ;
		
		while(true){
			
			System.out.print("1) 추가 2) 수정 3) 삭제 4)리스트 5)총개수 6)파일저장 7)파일내용 추가 8)파일 보기 9)종료 ==> ");
			this.choice = s.nextInt();
			System.out.print("------------------------------\n");
			if(choice==9) break;
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
				System.out.print("\n메뉴번호    메뉴이름    원산지      1인분 가격\n");
				show();
			}
			if(choice==5) {
				System.out.printf("%d개의 메뉴가 등록되었습니다.\n\n",u.size());
			}
			if(choice==6) {
				String txt,kk;

		        try{
		        	BufferedWriter fw = new BufferedWriter(new FileWriter(fileName,false));	
		            for(int k=0;k<u.size();k++) {
		            	kk=k+" ";
		            	fw.write(kk); 
		            	txt = u.get(k).forFile() ;
						 
						 fw.write(txt);
						 }
		            fw.flush();
		            fw.close(); 
		            System.out.printf("저장되었습니다.\n");
		             
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		         
			}//if
			if(choice == 7) {
				
				try{
		            FileReader filereader = new FileReader(fileName);
		            BufferedReader bufReader = new BufferedReader(filereader);
		            String line = "";
		            while((line = bufReader.readLine()) != null){
		            	
		            	String[] W = line.split("\\s");
		            	int p=Integer.parseInt(W[0]);
		            	this.name = W[1];
		            	this.origin = W[2];
		            	this.money = Integer.parseInt(W[3]);
		            	u.add(p+u.size(),new Menupan1(name, origin, money));
		            	
		            	System.out.print("가져온 내역\n");
		                System.out.println(line);
		            }          
		            bufReader.close();
		        }catch (FileNotFoundException e) {
		        }catch(IOException e){
		            System.out.println(e);
		        }
			}
			if(choice == 8) {
				
				try{
		            FileReader filereader = new FileReader(fileName);
		            BufferedReader bufReader = new BufferedReader(filereader);
		            String line = "";
		            while((line = bufReader.readLine()) != null){
		            	System.out.println("파일 내역.");
		                System.out.println(line);
		            }          
		            bufReader.close();
		        }catch (FileNotFoundException e) {
		        }catch(IOException e){
		            System.out.println(e);
		        }
			}
		
		}
	
	}
}

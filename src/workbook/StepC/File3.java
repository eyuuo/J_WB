package workbook.StepC;

import java.util.Scanner;

public class File3 {

	private int megabytes;
	private double time;
	private long bytes;
	private byte kind;
	
	public File3(){input();}
	public void printFile() {
		System.out.printf("파일 전송 시간은 %.1f초 입니다.\n",getTime());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요.");
		this.megabytes = s.nextInt();
		System.out.printf("전송방식을 1:Wi-Fi, 2:BlueTooth, 3:LTE, 4:USB 에서 선택하여 입력하세요.");
		this.kind = s.nextByte();
	}	
	
	long getByte() {
		bytes = megabytes *1024 * 1024;
		return this.bytes;
	}	
	double getTime() {
		bytes =getByte();
		time =0;
		if(kind==1) {
			time = (double)bytes/1500000;
		}
		else if(kind==2) {
			time = (double)bytes/3000000;
		}
		else if(kind==3) {
			time = (double)bytes/1000000;
		}
		else if(kind==4) {
			time = (double)bytes/60000000;
		}
		
		return this.time;
	}
}

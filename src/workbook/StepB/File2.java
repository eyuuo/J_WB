package workbook.StepB;

import java.util.Scanner;

public class File2 {

	private int megabytes;
	private int time;
	private long bytes;
	private String usb2;
	
	public File2(){input();}
	public void printFile() {
		System.out.printf("파일 전송 시간은 "+getTime()+"초 입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요.");
		this.megabytes = s.nextInt();
		System.out.printf("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요.");
		this.usb2 = s.next();
	}	
	
	long getByte() {
		bytes = megabytes *1024 * 1024;
		return this.bytes;
	}	
	int getTime() {
		bytes =getByte();
		time =0;
		if(usb2.equalsIgnoreCase("N")) {
			time = (int)bytes/1500000;
		}
		else {
			time = (int)bytes/60000000;
		}	
		return this.time;
	}
}

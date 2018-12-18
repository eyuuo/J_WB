package workbook.StepA2;

import java.util.Scanner;

public class File {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;
	
	public File(){input();}
	public void printFile() {
		System.out.printf("입력하신 파일 용량은 \n"+getMegabytes()+"메가바이트,\n"+getKilobytes()+"킬로바이트,\n"+getByte()+"바이트 입니다.\n" );
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 기가바이 단위로 입력하세요.");
		this.gigabytes = s.nextInt();
	}	
	
	int getMegabytes() {
		megabytes = gigabytes * 1024;
		return this.megabytes;
	}
	int getKilobytes() {
		kilobytes =megabytes * 1024;
		return this.kilobytes;
	}
	

	long getByte() {
		bytes = kilobytes * 1024;
		return this.bytes;
	}	
}

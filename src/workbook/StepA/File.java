package workbook.StepA;

import java.util.Scanner;

public class File {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;
	
	public File(){input();}
	public void printFile() {
		System.out.printf("입력하신 파일 용량은 \n %d 메가바이트,\n %d 킬로바이트,\n %d 바이트 입니다.\n",getMegabytes(),getKilobytes(), getByte());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 기가바이트 단위로 입력하세요");
		this.gigabytes = s.nextInt();
	}	
	
	int getMegabytes() {
		megabytes = gigabytes * 1024;
		return this.megabytes;
	}
	int getKilobytes() {
		megabytes=getMegabytes();
		kilobytes =megabytes * 1024;
		return this.kilobytes;
	}
	

	long getByte() {
		kilobytes = getKilobytes();
		bytes = (long)kilobytes * 1024;
		return this.bytes;
	}	
}

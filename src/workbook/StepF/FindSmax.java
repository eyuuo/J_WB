package workbook.StepF;
import java.util.Scanner;

public class FindSmax {

	private int num[] = new int[10]; // 10개의 숫자를 담을 리스트
	private int first; // 첫 번째로 큰 수
	private int second; // 두 번째로 큰 수
	private int second_max_index; // 두 번째로 큰 수의 인덱스
	private int newnum; // 숫자 입력을 위한 변수
	
	
	public FindSmax() {input();}
	
	public void printSmax() {
		second_max_index=getSmax();
		System.out.printf("두 번째로 큰 수는 %d번째 수 %d입니다.",second_max_index+1,num[second_max_index]);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<10;i++) {
			System.out.printf("%d번째 수를 입력하시오.",i+1);
			this.num[i] = s.nextInt();
		}
	}
	
	int getSmax() {
		
		first=num[0];
		for(int i = 0; i<10;i++) {
		if(first<num[i])
			first=num[i];
		}
		System.out.println(first);
		for(int i = 0; i<10;i++) {
			if(num[i]!=first&&second<num[i])
				second=num[i];
			}
		System.out.println(second);
		for(int i = 0; i<10;i++) {
			if(num[i]==second)
				second_max_index=i;
			}
		return this.second_max_index;
	}
}

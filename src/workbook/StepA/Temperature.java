package workbook.StepA;

public class Temperature {

	private float C;
	private float F;
	
	public Temperature(){input();}
	
	public void printAge() {
		System.out.printf("화씨 온도 %f도 입니다.\n", getAge());
	}	
	
	void input() {
		Scanner S = new Scanner(System.in);
		System.out.printf("섭씨 온도를 입려하시오.");
		this.C = s.nextInt();
	}	
	float getAge() {
		F = C *(1.8) + 32;
		return this.F;
	}	
	
}

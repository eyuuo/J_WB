package workbook.StepJ;


public class Ackermann {

	public Ackermann(){input();}
	
	void input() {
		
		for(int m = 0; m<4;m++)
			for(int n =0;n<4;n++) {
				System.out.printf("Ackermann(%d,%d) = %d\n",m,n,Ackermann(m,n));
			}
	
	}
	
	int Ackermann(int i, int j)  {
		if(i==0&&j>=0) return j+1;
		if(i>0&&j==0) return Ackermann(i-1,1);
		if(i>0&&j>0) return Ackermann(i-1,Ackermann(i,j-1));
		return 0;
	}
	
}

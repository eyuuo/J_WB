
import java.util.Scanner;

import workbook.StepA.StepAManager;
import workbook.StepB.StepBManager;
import workbook.StepC.StepCManager;
import workbook.StepD.StepDManager;
import workbook.StepE.StepEManager;
import workbook.StepF.StepFManager;
import workbook.StepG.StepGManager;
import workbook.StepH.StepHManager;
import workbook.StepI.StepIManager;
import workbook.StepJ.StepJManager;

public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은?");
	    String Step;
	    Step= s.next(); 
		if(Step.equalsIgnoreCase("A"))
			new StepAManager();
		else if(Step.equalsIgnoreCase("B"))
			new StepBManager();
		else if(Step.equalsIgnoreCase("C"))
			new StepCManager();
		else if(Step.equalsIgnoreCase("D"))
			new StepDManager();
		else if(Step.equalsIgnoreCase("E"))
			new StepEManager();
		else if(Step.equalsIgnoreCase("F"))
			new StepFManager();
		else if(Step.equalsIgnoreCase("G"))
			new StepGManager();
		else if(Step.equalsIgnoreCase("H"))
			new StepHManager();
		else if(Step.equalsIgnoreCase("I"))
			new StepIManager();
		else if(Step.equalsIgnoreCase("J"))
			new StepJManager();
		
		System.out.printf("종료되었습니다.\n");
	}	
} 

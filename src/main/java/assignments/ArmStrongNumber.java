package assignments;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 152; int input1 = input; 
		int arm = 0;
		do{
			int remind = input%10;
			arm = arm+(remind*remind*remind);
			 input= input/10;
		}
		while (input>0);
		
		if (arm == input1) {
			System.out.println("Given Number is Armstrong");
			
		}
		else {
			System.out.println("Not an armstrong Number");
		}
			
	}
		
			
		}

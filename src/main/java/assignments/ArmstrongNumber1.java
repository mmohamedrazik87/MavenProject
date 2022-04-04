package assignments;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 152;
		int input1 = input;
		int arm = 0;

		do {
			int remind = input % 10;
			arm = arm + (remind * remind * remind);
			input = input / 10;

		} while (input > 0);

		if (arm == input1) {
			System.out.println(input1 + " is an armstrong number");

		} else {
			System.out.println(input1 + " is NOT an armstrong number");

		}
	}
}

package javaPrograms;

public class Calculator {

	// TODO Auto-generated method stub

	public int addition(int num1, int num2, int num3) {

		int sum = num1 + num2 + num3;
		System.out.println("addition = " + sum);
		return sum;

	}

	public int subraction(int num1, int num2) {

		int sub = num1 - num2;
		System.out.println("subraction = " + sub);
		return sub;

	}

	public double multiply(double num1, double num2) {

		double mul = num1 * num2;
		System.out.println("multiplication = " + mul);
		return mul;

	}

	public float div(float num1, float num2) {

		float division = num1 / num2;
		System.out.println("division = "+ division);
		return division;

	}

}

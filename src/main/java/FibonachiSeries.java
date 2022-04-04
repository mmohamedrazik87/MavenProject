import java.util.Scanner;

public class FibonachiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6,   a = 0, b = 0, c = 1;
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		n= sc.nextInt();
		System.out.println("Fibnoccis series  ");*/
		for (int i = 0; i <  n; i++) {
			
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+"");
		}
		

	}

}

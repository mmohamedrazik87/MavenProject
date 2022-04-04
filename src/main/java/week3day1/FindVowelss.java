package week3day1;

public class FindVowelss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Education";
		String lowerCase = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (lowerCase.charAt(i)=='a'|| lowerCase.charAt(i)=='e'||
					lowerCase.charAt(i)=='i'||lowerCase.charAt(i)=='o'||lowerCase.charAt(i)=='u')
				
				System.out.println(lowerCase.charAt(i) + " is a vowel");
			
		}

	}

}

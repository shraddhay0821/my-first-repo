package methods;

public class StringPalindrome {

	public static void main(String[] args) {
		String word= "madam";
		String original = word;
		String reverse = "";
		for(int i=word.length()-1; i>=0; i--) 
			
			reverse=reverse + word.charAt(i);
			
			if (original.equals(reverse)) {
			System.out.println(word +   " its a palindrome");
			}
		
		
		else {
			System.out.println(word + " its not a palindrome");
		}
	}

}

package myfirstpackage;

public class practice {

	public static void main(String[] args) {
		
		int number=1234;
				int sum=0;
			while(number!=0) {
				int digit=number%10;
				sum=sum+digit;
				number=number/10;
				
			}
					System.out.print("sum of four number : "+ sum);
			
		
			

	}

}

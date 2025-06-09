package conditionalstatements;

public class statements {

	public static void main(String[] args) {
		int Maths = 30;
		int Science = 30;
		int English = 40;
		int avg = ((Maths+Science+English)/3); 
		if (avg>=90 && avg<=100)
		{
		 System.out.println("A+");
		System.out.println("Excellent performance!");
		} 
		else if (avg>= 75 && avg<= 89)
		  {
		 System.out.println("A");
		System.out.println("Excellent performance!");
		  } else if (avg>=60 && avg<=74)
		{
			System.out.println("B");
			System.out.println("Keep Improving");  
			}
		else if (avg>=40 && avg<=59)
		{
			System.out.println("C");
			System.out.println("Keep Improving");
		}
		else if (avg<40)
		{ 
			System.out.println("Fail");	
		}
		}
        }

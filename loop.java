package myfirstpackage;

public class loop {

	public static void main(String[] args) {
		int i;
		for( i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}

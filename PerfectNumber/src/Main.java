import java.util.Scanner;

public class Main {
	static Scanner scanner;
	
	public static void main (String[] args)
	{
		int  Sum = 0;
		int Input = 0;
					
		System.out.println("Enter any positive number");
		
		scanner = new Scanner(System.in);
		Input = scanner.nextInt();
		
		for(int i = 1; i < Input; i++)
		{
			if(Input % i == 0)
			{
				Sum = Sum + i;
			}
		}
		
		if(Sum == Input)
		{
			System.out.println("Entered number is perfect number!");
		}
		else if(Sum < Input)
		{
			System.out.println("Entered number is deficient!");
		}
		else 
		{
			System.out.println("Entered number is abundant!");
		}	
	}
}

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
	static Scanner scanner;
	
	
	public static void main (String[] args)
	{
		int  Sum = 0;
		int Input = 0;
		
		System.out.println("Enter any positive number");
		
		scanner = new Scanner(System.in);
		Input = scanner.nextInt();
		
		int Number = Input;
		
		Sum = IntStream.range(1, Input).filter(i -> Number % i == 0).sum(); 
		
		
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

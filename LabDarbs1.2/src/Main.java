import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	static Scanner scanner;
	
	public static Set<Integer> numbers(int i)
	{
		Set<Integer> numbers = new HashSet<Integer>();
		int[] array = IntStream.rangeClosed(1, i/2).toArray();
		IntStream stream = Arrays.stream(array).filter(d -> i % d == 0);
		stream.forEach(s -> numbers.add(s));
		return numbers;
	}
	
	
	public static void main (String[] args)
	{
		int  Sum = 0;
		int Input = 0;
					
		System.out.println("Enter any positive number");
		
		scanner = new Scanner(System.in);
		Input = scanner.nextInt();
		
		Sum  = numbers(Input).stream()
		  .collect(Collectors.summingInt(Integer::intValue));		
		
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

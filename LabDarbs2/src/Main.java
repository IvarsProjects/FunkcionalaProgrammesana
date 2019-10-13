import java.util.Scanner;

public class Main {
	static Scanner scanner;
	
	public static boolean Palindrome(String Input) {    
	    int length = Input.length();
	    for( int i = 0; i < length/2; i++ )
	        if (Input.charAt(i) != Input.charAt(length-i-1)) return false;
	    return true;    
	}
		
	public static void main (String[] args)
	{
		String Input;
		
		System.out.println("Enter any string");
		
		scanner = new Scanner(System.in);
		Input = scanner.nextLine();
		
		if(Palindrome(Input))
		{		
			System.out.println("Entered string is palindrome!");
		}
		else
		{
			System.out.println("Entered string is not palindrome!");
		}
		
	}
}

import java.util.Scanner;

public class Main {
	static Scanner scanner;
		
    public static boolean isPalindrome(String input)
    {  
        if(input.length() == 1)
        {
            return true; 
        }
        if(input.charAt(0) == input.charAt(input.length()-1))  
        {
        return isPalindrome(input.substring(1, input.length()-1));  
        }
        else
        {
        	return false;
        }
        
    }
		
	public static void main (String[] args)
	{
		String Input;
		
		System.out.println("Enter any string");
		
		scanner = new Scanner(System.in);
		Input = scanner.nextLine();
		
		if(isPalindrome(Input))
		{		
			System.out.println("Entered string is palindrome!");
		}
		else
		{
			System.out.println("Entered string is not palindrome!");
		}
		
	}
}

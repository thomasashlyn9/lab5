/**
 * @author: Ashlyn Thomas
 * @since: 9/28/17
 * @version: 2.0
 */
package palindrome;
import java.util.Scanner;


public class Recursion 
{
	public static boolean isaPalindrome(String expr) {
		
	    //if string has 1 or 0 characters then it is automatically a palindrome
	    if(expr.length() < 2)
	    	return true;
	    	
			
	    //if the first char is not the same as the last it is not a palindrome
	    if(expr.charAt(0) != expr.charAt(expr.length()-1))
	    	return false;
	    	
	    	
	    //base case
	    //returns string containing from the next char to the length of the string -1 
		return isaPalindrome((expr.substring(1, expr.length() - 1)));
		
	}
	


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompts user for a palindrome
		System.out.println("Enter a palindrome"); 
		String x = input.nextLine();

		//as long as the string is not empty 
		while (!x.equals(""))
    	{
    		if (isaPalindrome(x))
    			System.out.println(x+ " is a palindrome\n");
    		
    		else
    			System.out.println(x+ " is *not* a palindrome\n");
    		
    		//prompts user to enter a new palindrome
    		System.out.print("Input a string\n >");
    		x = input.nextLine();
    		
    		//press enter to exit program
    	}

	}

}

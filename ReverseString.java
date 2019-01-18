import java.util.Scanner;

public class ReverseString{
	
	    public static void main(String[] args) {
		    //The scanner reader class allows us to read an input (string) from the user.
	        Scanner read = new Scanner(System.in);
	        System.out.println("Enter string to reverse:");
	        String str = read.nextLine();
	        String reverse = "";
	        read.close();
	        
	        String arr[] = str.split(" "); // This line splits the inputed string into an array (words).
	        for (int i = 0; i < arr.length; i++) {
	        	 for (int j = arr[i].length() - 1; j >= 0; j--) {  // This line reverses each character in the respective
	        		 reverse = reverse + arr[i].charAt(j);     // arrays.
	            }
	        	 reverse = reverse + " "; // This allows for a space to be included between the words after the 
					           // concatenation of the arrays.
	        }
	        System.out.println("Reversed string is: " + reverse);	
	       }	 
	    }




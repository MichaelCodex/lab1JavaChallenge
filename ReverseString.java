import java.util.Scanner;

public class ReverseString{
	
	    public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
	        System.out.println("Enter string to reverse:");
	        String str = read.nextLine();
	        String reverse = "";
	        read.close();
	        
	        String arr[] = str.split(" ");
	        for (int i = 0; i < arr.length; i++) {
	        	 for (int j = arr[i].length() - 1; j >= 0; j--) {
	        		 reverse = reverse + arr[i].charAt(j);
	            }
	        	 reverse = reverse + " ";
	        }
	        System.out.println("Reversed string is: " + reverse);	
	       }	 
	    }




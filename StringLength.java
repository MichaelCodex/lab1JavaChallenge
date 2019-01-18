
public class StringLength {  
	/**this method accepts a string (input) as an input and returns the length of the string*/
	public static int stringLen ( String input ) {
		//the next line of code is the statement required by the question 
		int strLength = input.length(); //This line stores the length of the input
		
		if (strLength < 0) {
			System.out.println("Inputed string is invalid"); // Checks whether string has element(s) or not
		}
		if (strLength >= 0) {
			System.out.println("String contains an element(s)!"); 
		}
			return strLength;
	}
	//main method to test the code
    public static void main(String[] args) {  
    	System.out.println(StringLength.stringLen("Michael and Issifu"));
    
    	
      
} 
}

import java.lang.Math;
import java.util.Scanner;
/** this code  asks the user for the radius of a circle and calculates  its area and circumference*/
public class CircleProperties {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);//creating an instance of the scanner class to read user input
        System.out.println("Enter your radius:");//asking the user for input
        double radius = reader.nextDouble();
        reader.close();//closes scanner
		
        double circleArea= (Math.PI * (radius * radius));//calculation of area
        double circleCircumference= (2* Math.PI * radius);//calculaton of circumference
        
        System.out.println(String.format("%.2f",circleArea) + " is the area of the circle.");
        System.out.println(String.format("%.2f",circleCircumference)+ " is the circumference of the circle.");
       
    	}
	}



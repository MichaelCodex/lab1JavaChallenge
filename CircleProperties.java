import java.lang.Math;
import java.util.Scanner;

public class CircleProperties {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
        System.out.println("Enter your radius:");
        double radius = reader.nextDouble();
        reader.close();
		
        double circleArea= (Math.PI * (radius * radius));
        double circleCircumference= (2* Math.PI * radius);
        
        System.out.println(String.format("%.2f",circleArea));
        System.out.println(String.format("%.2f",circleCircumference));
       
    	}
	}



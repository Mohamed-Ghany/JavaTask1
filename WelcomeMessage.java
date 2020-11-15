--Master Task1--
--create a program that print welcome message to your User
import java.util.Scanner;

public class WelcomeMessage {
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter your Name");
		Scanner userinput =new Scanner(System.in);
		String userName =userinput.next();
		
		System.out.println("Welcome Dear customer :"+userName);
			
	}

}

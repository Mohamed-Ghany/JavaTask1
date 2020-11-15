import java.util.Scanner;
public class TakeUserData {
//create program that take user data(name, age, email, faculty) line by line and print these data to user screen
	
		public static void main(String[] args) {
			
			
			Scanner userInput =new Scanner(System.in); // create object from Scanner written only one time , its name"userInput"
			
			System.out.println("Please Enter your Name :");
			String userName =userInput.next();
						
			System.out.println("your Age :");
			int userAge =userInput.nextInt();  //variable called "userAge" with data type int & add nextInt()
			
			System.out.println("your Email :");
			String userEmail =userInput.next();
			
			System.out.println("your Faculty :");
			String userFaculty =userInput.next();
				
			System.out.println("\nYour Name is:"+"\t"+userName);
			System.out.println("Your Age is:"+"\t"+userAge);
			System.out.println("Your Email is:"+"\t"+userEmail);
			System.out.println("Your Faculty is:"+userFaculty);
			
			userInput.close(); // To close the Scanner
		}

	}
	

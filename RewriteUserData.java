import java.util.Scanner;
//Re-Write task two by using method that will take user data and print it
public class RewriteUserData {  //Create the Class

	public static void main(String[] args) {   // create main methode
			
		Scanner userInput =new Scanner(System.in);
		
		System.out.println("Please Enter your \"Name\" :");
		String userName =userInput.next();
		
		System.out.println("Please Enter your \"Age\" :");
		int userAge =userInput.nextInt();
		
		System.out.println("Please Enter your \"Email\" :");
		String userEmail =userInput.next();
		
		System.out.println("Please Enter your \"Faculty\" :");
		String userFaculty =userInput.next();
		
printUserData("\nThe User Data are :\n"+userName, userAge, userEmail, userFaculty); //this's to Call or invoking the below method"printUserData"
				
	}
	//create print method to define the data wanted & type & print them
	public static void printUserData (String name,int age,String email,String faculty) { // Method,,void as no return & (Static so that can call the above main Static method)
		 
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(faculty);
		 
		 }
	
	}
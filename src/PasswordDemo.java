import java.util.Scanner;
public class PasswordDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password = "enter1234";		
		System.out.println("Enter the passowrd");
		String passwordEntered = input.nextLine();		
		while (!passwordEntered.equals(password)) {
			System.out.println("Try again... Enter the passowrd");
			 passwordEntered = input.nextLine();
		}
		System.out.println("Welcome to the program!");
		//logical code in the app
	}
}

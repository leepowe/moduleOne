import java.util.Scanner;
public class evenMoreStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email");
		String email = input.nextLine();		
		System.out.println(email.toLowerCase());
	}
}
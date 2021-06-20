import java.util.Scanner;
public class UserInputDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String userName = input.nextLine();
		System.out.println("Enter your favorite integer:");
		int favInteger = input.nextInt();
		System.out.println("Enter your favorite double:");
		double favDouble = input.nextDouble();
		System.out.println("Hello " + userName);
		System.out.println("Your favorite integer is " + favInteger);
		System.out.println("Your favoirte double is " + favDouble);
		input.close();
	}
}

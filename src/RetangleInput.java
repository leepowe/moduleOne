import java.util.Scanner;
public class RetangleInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String userName = input.nextLine();
		System.out.println("What is the height of the rectangle in inches: ");
		int rectangleHeight = input.nextInt();
		System.out.println("What is the width of the rectangle in inches: ");
		int rectangleWidth = input.nextInt();
		int area = (rectangleHeight * rectangleWidth);
		String areaInches = (area + " inches squared");
		System.out.println("Hello " + userName);
		System.out.println("The area of the rectangle is " + areaInches);		
		input.close();
	}
}
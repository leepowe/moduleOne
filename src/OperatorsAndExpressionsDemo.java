public class OperatorsAndExpressionsDemo {
	public static void main(String[] args) {
		System.out.println(1 + 1);
		System.out.println(1 - 1);
		System.out.println(2 * 2);
		// int division
		System.out.println("Int division: " + 10 / 6);
		// modulus division (looking at the value left in the remainder)
		System.out.println("mod division: " + 10 % 6);
		// real division (at least 1 number needs to be decimal)
		System.out.println("real division: " + 11.5 / 3.0);
		int age = 20;
		age++; // adds 1 to age
		System.out.println("Your age increased is " + age);
		age += 2; // age = age + 2
		System.out.println("Your are now older by 2 more years at age " + age);
		age--;
		System.out.println("You just got younger you are now " + age);
		System.out.println("5 is greater than 1 " + (5 > 1)); // conditionals
		System.out.println("5 is greater than 10 " + (5 >= 10));
		System.out.println("Age is equal to 21 " + (age == 21)); // is age equal to 21
		System.out.println("Age is not equal to 100 " + (age != 100));
	}
}


public class Conditionals {

	public static void main(String[] args) {
		int age = 17;
		//create a program that says that you can drive if you are at least 16
		//if you are 15 you can't drive but you can get a learner's permit

		//if-else statement
//		if (age >= 16) {
//			System.out.println("You are old enough to drive.");
//		} else if (age == 15){
//			System.out.println("You can get a learner's permit.");
//		} else {
//			System.out.println("Sorry, you are not old enough to drive");
//		}
//	}
		//switch-case
		switch (age) {
		case 16: //can't do >= (very case specific)
			System.out.println("You are old enough to drive.");
			break;
		case 15:
			System.out.println("You can get a learner's permit.");
			break;
		default:
			System.out.println("Sorry, you are not old enought to drive.");
			}
	}
}
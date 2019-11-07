import java.util.Scanner;

public class Bin2Dec {

	private static final String ONE = "1";
	private static final String ZERO = "0";

	static Scanner scanner = new Scanner(System.in);
	private static Boolean playGame = true;
	private static String input;

	public static void main(String[] args) {
		// validateInput();
		translateBinary();

	}

//	private static void validateInput() {
//
//		System.out.println("Enter number");
//		input = scanner.nextLine();
//
//		if (!input.equals(ONE) && input.equals(ZERO)) {
//			System.out.println("You didn't enter a valid number. Only ONE and ZERO are expected, GoodBye!!");
//		} else {
//			translateBinary(input);
//		}
//
//	}

	private static void translateBinary() {
		System.out.println("Enter number");
		input = scanner.nextLine();

		int length = input.length();
		int result = 0;
		int count = 0;


		for (int i=length-1; i >= 0; i--) {

			int value = Character.getNumericValue(input.charAt(count));

			count++;

			if (value == 1) {
				result += Math.pow(2, i);

			}
			System.out.println(value);
			System.out.println(result);
		}

	}
}

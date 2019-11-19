package bin2dec;

import java.util.Scanner;

public class Bin2Dec {

	private static final String ONE = "1";
	private static final String ZERO = "0";

	static Scanner scanner = new Scanner(System.in);
	private static String input;

	public static void main(String[] args) {
		String input = getInput();

		if (validateInput(input)) {
			translateBinary(input);
		}

	}

	private static String getInput() {
		System.out.println("Enter number to translate");
		 input = scanner.nextLine();

		 return input;

	}

	private static boolean validateInput(String input) {
		return input.contains(ONE) && input.contains(ZERO);

	}

	private static void translateBinary(String input) {

		int length = input.length();
		int result = 0;
		int count = 0;


		for (int i=length-1; i >= 0; i--) {

			int value = Character.getNumericValue(input.charAt(count));

			count++;

			if (value == 1) {
				result += Math.pow(2, i);

			}
		}

		System.out.println(result);

	}
}

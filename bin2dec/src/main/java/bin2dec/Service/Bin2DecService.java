package bin2dec.Service;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Bin2DecService {

	private static final String ONE = "1";
	private static final String ZERO = "0";

	static Scanner scanner = new Scanner(System.in);
	private static String input;


	public  String getInput() {

		String input = getInput();

		if (validateInput(input)) {
			translateBinary(input);
		}

		System.out.println("Enter number to translate");
		input = scanner.nextLine();

		return input;

	}

	public  boolean validateInput(String input) {
		return input.contains(ONE) && input.contains(ZERO);

	}

	public Integer translateBinary(String input) {

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

		return result;

	}
}

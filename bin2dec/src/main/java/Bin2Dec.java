import java.util.Scanner;

public class Bin2Dec {

	private static final String ONE = "1";
	private static final String ZERO = "0";

	static Scanner scanner = new Scanner(System.in);
	private static Boolean playGame = true;

	public static void main(String[] args) {
		translateBinary();

	}

	private static void translateBinary() {
		
		while (playGame) {
			System.out.println("Enter number");

			String input = scanner.nextLine();
			validateInput(input);

		}

	}

	private static void validateInput(String input) {

		if (!input.equals(ONE) && !input.equals(ZERO)) {
			System.out.println("You didn't enter a valid number");
			System.out.println("GoodBye :(");
			playGame = false;
		}
	}
}

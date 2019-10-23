import java.util.Scanner;

public class Bin2Dec {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		translateBinary();

	}

	private static void translateBinary() {
		System.out.println("Enter number");

		String input = scanner.nextLine();
		System.out.println(input);

	}
}

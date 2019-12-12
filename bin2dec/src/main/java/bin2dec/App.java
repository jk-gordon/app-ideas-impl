package bin2dec;

import bin2dec.Controller.Bin2DecController;
import bin2dec.Service.Bin2DecService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

//	private static final String ONE = "1";
//	private static final String ZERO = "0";
//
//	static Scanner scanner = new Scanner(System.in);
//	private static String input;

	public static void main(String[] args) {

		Bin2DecService bin2DecServiceService = new Bin2DecService();
		Bin2DecController bin2DecController = new Bin2DecController(bin2DecServiceService);

		bin2DecController.translate();


	}

//	private static String getInput() {
//		System.out.println("Enter number to translate");
//		 input = scanner.nextLine();
//
//		 return input;
//
//	}
//
//	private static boolean validateInput(String input) {
//		return input.contains(ONE) && input.contains(ZERO);
//
//	}
//
//	public static void translateBinary(String input) {
//
//		int length = input.length();
//		int result = 0;
//		int count = 0;
//
//
//		for (int i=length-1; i >= 0; i--) {
//
//			int value = Character.getNumericValue(input.charAt(count));
//
//			count++;
//
//			if (value == 1) {
//				result += Math.pow(2, i);
//
//			}
//		}
//
//		System.out.println(result);
//
//	}
}

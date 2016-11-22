package domain;
import java.util.Scanner;

public class PostalCode {
	String postalCode;
	static String msg;

	public PostalCode(String a) {
		String postalCodeConstructor = a;
		if (checkPostalCode(postalCodeConstructor) == true) {
			SetPostalCode(postalCodeConstructor);
		}
		if (checkPostalCode(postalCodeConstructor) == false) {
			System.out.println(msg);
		}

	}

	public static boolean checkPostalCode(String postal) {
		if (postal == null || postal.isEmpty()) {
			msg = "Empty postal code";
			return false;
		}
		int len = postal.length();
		if ((len == 7) && (postal.charAt(3) != ' ')) {
			msg = "Invalid postal code length (7 characters requires with space in middle of code  Ex. XXX XXX)";
			return false;
		} else if ((len != 6) && (len != 7)) {
			msg = "Invalid postal code length (6 characters required)";
			return false;
		}
		if (len == 7) {
			postal = postal.replace(" ", "");
			len = postal.length();
		}
		final char[] invalidUpLetters = { 'D', 'F', 'I', 'O', 'Q', 'U' };
		final char[] invalidLowLetters = { 'd', 'f', 'i', 'o', 'q', 'u' };
		for (int i = 0; i < len; ++i) {
			final char c = postal.charAt(i);
			if (i % 2 == 0) {
				if (!Character.isLetter(c)) {
					msg = "Invalid letter at position \"" + ++i + "\"";
					return false;
				}
				for (int j = 0; j < invalidUpLetters.length; ++j) {
					if ((c == invalidUpLetters[j])) {
						msg= "Invalid letter used in postal code, that is \"" + invalidUpLetters[j] + "\"";
						return false;
					}
					if ((c == invalidLowLetters[j])) {
						msg = "Invalid letter used in postal code, that is \"" + invalidLowLetters[j] + "\"";
						return false;
					}
				}
				if ((i == 0) && (c == 'W' || c == 'w' || c == 'Z' || c == 'z')) {
					msg = "First position letter cannot be W or Z";
					return false;
				}
			} else if ((i % 2 == 1) && (!Character.isDigit(c))) {
				msg = "Invalid digit at position \"" + ++i + "\"";
				return false;
			}
		}
		return true;
	}

	public void SetPostalCode(String st) {
		postalCode = st;
	}

	public String toString() {
		return postalCode;
	}

	public static void main(String[] args) {
		String a;
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter Postal Code: ");
		a = input.nextLine();
		PostalCode p1 = new PostalCode(a);

		System.out.println("Postal Code:  " + p1.toString());

	}
}

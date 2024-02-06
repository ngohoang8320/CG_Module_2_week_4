package validate_phone_number;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberTest {
    private static List<String> numbers = new ArrayList<>();

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("(84)-(0978489648)");
        numbers.add("(a8)-(22222222)");
        numbers.add("(84)-(22b22222)");
        numbers.add("(84)-(9978489648)");

        PhoneNumberRegex check = new PhoneNumberRegex();

        for (String number : numbers) {
            if (check.validate(number)) {
                System.out.println(number + " is valid.");
            } else {
                System.out.println(number + " is NOT valid.");
            }
        }
    }
}

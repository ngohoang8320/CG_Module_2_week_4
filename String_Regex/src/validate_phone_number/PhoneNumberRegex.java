package validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    private static final String PHONE_NUMBER_REGEX = "\\(\\d{2}\\)-\\(0\\d{9}\\)";

    private static Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}

package validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameRegex {
    private static final String CLASS_NAME_REGEX = "[A|C|P]\\d{4}[G|H|I|K]";

    private static Pattern pattern;

    private Matcher matcher;

    public ClassNameRegex() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

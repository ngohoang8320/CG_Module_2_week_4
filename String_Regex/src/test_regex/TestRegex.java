package test_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String text = "Hello, my name is John Doe";
        String regex = "[A-Z|a-z][a-z]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}

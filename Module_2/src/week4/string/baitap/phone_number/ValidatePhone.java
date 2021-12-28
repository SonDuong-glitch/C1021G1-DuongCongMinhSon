package week4.string.baitap.phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static final String REGEX = "^\\(84\\)\\-\\(\\d{10}\\)$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

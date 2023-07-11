package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {
    public static String validFirstName(String fName) {
        Pattern pattern = Pattern.compile("[A-Za-z]{3,}");

        Matcher matcher = pattern.matcher(fName);
        if (matcher.matches()) {
            return "valid";
        } else {
            return "invalid";
        }

    }
    public static String validLastName(String fName) {
        Pattern pattern = Pattern.compile("[A-Za-z]{3,}");

        Matcher matcher = pattern.matcher(fName);
        if (matcher.matches()) {
            return "valid";
        } else {
            return "invalid";
        }
    }
}



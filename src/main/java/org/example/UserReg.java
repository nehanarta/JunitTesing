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
    public static String validLastName(String LName) {
        Pattern pattern = Pattern.compile("[A-Za-z]{3,}");

        Matcher matcher = pattern.matcher(LName);
        if (matcher.matches()) {
            return "valid";
        } else {
            return "invalid";
        }
    }
    public static String validEmail(String Email) {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");

        Matcher matcher = pattern.matcher(Email);
        if (matcher.matches()) {
            return "valid";
        } else {
            return "invalid";
        }
    }
    public static String validMobileNo(String MobileNo) {
        Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");

        Matcher matcher = pattern.matcher(MobileNo);
        if (matcher.matches()) {
            return "valid";
        } else {
            return "invalid";
        }
    }

}



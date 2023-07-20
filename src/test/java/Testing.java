import org.example.UserReg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testing {
    static UserReg User;

    @BeforeAll
    public static void initiate() {
        User = new UserReg();
    }

    @Test
    public void givenTextWhenItContainsFirstCapsAndMinThreeCharShouldReturnTrue() {
        String actual = UserReg.validFirstName("Neha");
        String Excepted = "valid";
        Assertions.assertEquals(Excepted, actual);
    }

    @Test
    public void givenTextWhenContainsLastCapsAndMinThreeCharShouldReturnTrue() {
        String actual = UserReg.validLastName("Patil");
        String Excepted = "valid";
        Assertions.assertEquals(Excepted, actual);

    }

    @Test
    public void givenEmailWhenAccordingToProperNumberShouldReturnTrue() {
        String actual = UserReg.validEmail("Abc@gmail.com");
        String Excepted = "valid";
        Assertions.assertEquals(Excepted, actual);
    }
    @Test
    public void givenMobileNumberWithSpaceAndProperNumberShouldReturnTrue(){
        String actual = UserReg.validMobileNo("9999999998");
        String Excepted = "valid";
        Assertions.assertEquals(Excepted, actual);
    }
    }



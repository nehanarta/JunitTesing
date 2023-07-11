import org.example.UserReg;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Testing {
static UserReg User;
@BeforeAll
    public static void initiate(){
    User=new UserReg();
}
@Test
    public void  givenTextWhenItContainsFirstCapsAndMinThreeCharShouldReturnTrue(){
    String actual=UserReg.validFirstName("Neha");
    String Excepted="valid";
    Assertions.assertEquals(Excepted,actual);
}
}

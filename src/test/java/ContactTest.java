import classes.AddressBook;
import classes.Contact;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    Contact testContact = new Contact(1, "Test John", 11111111111l, "placeholder@email.com");
    //use case two tests
    @Test
    public void setNameTest(){
        //act
        String expectedOutput = "Test John";
        String actualOutput = testContact.getName();

        //assert
        assertEquals(expectedOutput, actualOutput);
    }

    //use case three tests
    @Test
    public void setPhoneNumberTest(){
        //act
        long expectedOutput = 11111111111L;
        long actualOutput = testContact.getPhoneNumber();

        //assert
        assertEquals(expectedOutput, actualOutput);

    }

    //use case four tests
    @Test
    public void setEmailTest(){
        //act
        String expectedOutput = "placeholder@email.com";
        String actualOutput = testContact.getEmail();

        //assert
        assertEquals(expectedOutput, actualOutput);
    }
}

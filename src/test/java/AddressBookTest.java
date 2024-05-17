import classes.AddressBook;
import classes.Contact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressBookTest {
    private AddressBook testAddressBook;

    @BeforeEach
    public void setUp() {
        testAddressBook = new AddressBook(1, "TestUser");
    }

    //use case 1 tests
    @Test
    public void addContactTest() throws Exception {
        //arrange
        Contact contact = mock();

        //act
        testAddressBook.addContact(contact);
        int arraySize = testAddressBook.getContactList().size();
        int expectedSize = 1;

        //assert
        assertEquals(arraySize, expectedSize);
    }
    @Test
    public void addContactTestTwo() throws Exception {
        //arrange
        Contact contact = mock();

        //act
        testAddressBook.addContact(contact);

        //assert
        assertEquals(contact, testAddressBook.getContactList().get(0));
    }

    //use case 5 test
    @Test
    public void searchUserTest() throws Exception {
        //arrange
        Contact testContact = new Contact(1, "John Smith", 11111111111L, "placeholder");

        //act
        testAddressBook.addContact(testContact);
        Contact actualOutput = testAddressBook.searchForUser("John Smith");

        //assert
        assertEquals(testContact, actualOutput);
    }

    //use case 6 tests
    @Test
    public void deleteUserTest() throws Exception {
        // Arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder1");
        Contact testContact2 = new Contact(2, "Jane Smith", 11111111113L, "placeholder2");
        Contact testContact3 = new Contact(3, "Joe Smith", 11111111112L, "placeholder3");

        // Act
        testAddressBook.addContact(testContact1);
        testAddressBook.addContact(testContact2);
        testAddressBook.addContact(testContact3);

        testAddressBook.deleteContact(11111111111L);
        int expectedOutput = 2;
        int actualOutput = testAddressBook.getContactList().size();

        // Assert
        assertEquals(expectedOutput, actualOutput);
    }

    //use case 7 tests
    @Test
    public void checkDuplicatePhoneNumberTest(){
        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder");
        long toSearch = 11111111111L;

        //act
        boolean expectedOutput = true;
        boolean actualOutput = testAddressBook.checkPhoneNumber(toSearch);

        //assert
        assertEquals(expectedOutput, actualOutput);

        //clear
        testAddressBook.getContactList().clear();
    }

    @Test
    public void checkAddContactDupeNumber() throws Exception {

        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder@hotmail.com");
        Contact testContact2 = new Contact(1, "John Smith", 11111111111L, "placeholder@gmail.com");

        //act
        testAddressBook.addContact(testContact1);
        Exception exception = assertThrows(Exception.class, () -> {
            testAddressBook.addContact(testContact2);
        });

        //assert
        assertEquals("Duplicate phone numbers and emails are not allowed", exception.getMessage());

        //clear
        testAddressBook.getContactList().clear();
    }

    //use case 8
    @Test
    public void checkDuplicateEmailTest(){
        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder");
        String emailToSearch = "placeholder";

        //act
        boolean expectedOutput = true;
        boolean actualOutput = testAddressBook.checkEmail(emailToSearch);

        //assert
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void checkAddContactDupeEmail() throws Exception {

        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder@gmail.com");
        Contact testContact2 = new Contact(1, "John Smith", 11111111112L, "placeholder@gmail.com");

        //act
        testAddressBook.addContact(testContact1);

        Exception exception = assertThrows(Exception.class, () -> {
            testAddressBook.addContact(testContact2);
        });

        //assert
        assertEquals("Duplicate phone numbers and emails are not allowed", exception.getMessage());

    }

    //use case 9
    @Test
    public void checkEditContact() throws Exception {
        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder");

        //act
        testAddressBook.addContact(testContact1);
        Contact actualOutput = testAddressBook.getUserToEdit(11111111111L);

        //assert
        assertEquals(testContact1, actualOutput);

        //clear
        testAddressBook.getContactList().clear();
    }

    @Test
    public void getIndex() throws Exception {
        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder");
        Contact testContact2 = new Contact(2, "Alan Shearer", 11111111112L, "pceholder");
        Contact testContact3 = new Contact(3, "Jon Smith", 11111111113L, "placehlder");

        //act
        testAddressBook.addContact(testContact1);
        testAddressBook.addContact(testContact2);
        testAddressBook.addContact(testContact3);

        int expectedOutput = 1;
        int actualOutput = testAddressBook.getIndex(11111111112L);


        //assert
        assertEquals(expectedOutput, actualOutput);

        //clear
        testAddressBook.getContactList().clear();

    }

    @Test
    public void replaceContactTest() throws Exception {
        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder");

        //act
        testAddressBook.addContact(testContact1);
        Contact editedContact = testAddressBook.getUserToEdit(11111111111L);
        editedContact.setName("Joe Miller");
        editedContact.setPhoneNumber(11134568212L);
        editedContact.setEmail("placehoeder@gmail");

        int index = testAddressBook.getIndex(11134568212L);

        testAddressBook.replaceContact(index, editedContact);

        Contact actualOutput = testAddressBook.getUserToEdit(11134568212L);
        //assert
        assertEquals(editedContact, actualOutput);
    }


    //use case 10
    @Test
    public void checkContactPrints() throws Exception {

        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "placeholder3");
        Contact testContact2 = new Contact(2, "Jane Smith", 11111111113L, "placeholder2");
        Contact testContact3 = new Contact(3, "Joe Smith", 11111111112L, "placeholde1r");

        //act
        testAddressBook.addContact(testContact1);
        testAddressBook.addContact(testContact2);
        testAddressBook.addContact(testContact3);

        int expectedOutput = 3;
        int actualOutput = testAddressBook.printContacts().size();

        //assert
        assertEquals(expectedOutput, actualOutput);


    }

    @Test
    public void getUserToEditReturns() throws Exception {
        //arrange
        Contact testContact1 = new Contact(1, "John Smith", 11111111111L, "johnsmith@gmail.com");
        testAddressBook.addContact(testContact1);

        //act
        Contact expectedOutput = testContact1;
        Contact actualOutput = testAddressBook.getUserToEdit(11111111111L);

        //assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void getUserToEditThrows() throws Exception {

        //act
        Exception exception = assertThrows(Exception.class, () -> {
            testAddressBook.getUserToEdit(1L);
        });

        //assert
        assertEquals("No contact found", exception.getMessage());


    }

    @Test
    public void searchForUserThrows() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            testAddressBook.searchForUser("Jhan");
        });

        assertEquals("No contact found", exception.getMessage());
    }

    @Test
    public void getIndexThrows() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            testAddressBook.getIndex(1L);
        });

        assertEquals("No contact found", exception.getMessage());
    }

    @Test
    public void deleteContactThrows() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
           testAddressBook.deleteContact(12367L);
        });

    assertEquals("No contact found", exception.getMessage());
    }
}

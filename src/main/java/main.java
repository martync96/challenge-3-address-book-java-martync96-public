//import classes.AddressBook;
//import classes.Contact;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class main {
//
//    public static class userInterface { //unfinished
//        Scanner scanner = new Scanner(System.in);
//
//        public void printMainMenuOptions() throws Exception {
//            System.out.println("""
//                Please select your option:\s
//                1. Search Contact\s
//                2. Add Contact\s
//                3. Edit Contact\s
//                4. Remove Contact\s
//                5. Exit""");
//            String input = scanner.nextLine();
//            processUserInput(input);
//        }
//
//        public void processUserInput(String input) throws Exception {
//            int inputToInt = Integer.parseInt(input);
//
//            switch(inputToInt){
//                case 1:
//                    searchUserInput();
//                    break;
//                case 2:
//
//                    break;
//                case 3:
//                    editContactInput();
//                    break;
//                case 4:
//                    removeContactInput();
//                    break;
//                case 5:
//                    break;
//                default:
//                    System.out.println("Please enter a valid option");
//            }
//        }
//
//        public void editContactInput() throws Exception{
//            System.out.println("Enter the number of the user you wish to edit");
//            String input = scanner.nextLine();
//            long toEdit = Long.parseLong(input);
//        }
//
//        public void searchContactToEdit(long phoneNumber) throws Exception{
//            AddressBook.getIndex(phoneNumber);
//            AddressBook.getUserToEdit(phoneNumber);
//        }
//
//        public void removeContactInput() throws Exception {
//            System.out.println("Enter the number of the user you wish to delete");
//            String input = scanner.nextLine();
//            long toDelete = Long.parseLong(input);
//            AddressBook.deleteContact(toDelete);
//            System.out.println("Contact successfully deleted");
//        }
//
//        public void searchUserInput() throws Exception {
//            System.out.println("Enter the name of the user you wish to search for");
//            String input = scanner.nextLine();
//            printContact(AddressBook.searchForUser(input));
//        }
//
//        public void printContact(Contact contact){
//            System.out.println("Contact: " + contact.getName() + "\n"
//                    + "Phone Number: " + contact.getPhoneNumber() + "\n"
//                    + "Email: " + contact.getEmail()
//            );
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//
//        AddressBook newAddressBook = new AddressBook(1, "Alan Shearer");
//        Contact newContact1 = new Contact(1, "Joe Bloggs", 11111111111L, "joebloggs@gmail.com");
//
//        //add a contact
//        newAddressBook.addContact(newContact1);
//
//        //search for contact
//        Contact searchedFor = AddressBook.searchForUser("Joe Bloggs");
//        printContact(searchedFor);
//
//        //Contact must have Name, Number and Email, uncomment to see
////        Contact newContact2 = new Contact();
//
//        //no dupes of email
//        Contact newContact3 = new Contact(1, "Joe Bloggs", 11111111111L, "joebloggs@gmail.com");
//        newAddressBook.addContact(newContact3); //doesn't throw exception as expected but it doesn't add.
//
//        ArrayList<String> printedContacts = newAddressBook.printContacts(); //save returned ArrayList to local variable
//        for(String contactToPrint: printedContacts){ //print contacts
//            System.out.println(contactToPrint);
//        }
//
//        //remove contact
//        Contact newContact4 = new Contact(3, "Jane Smith", 11111111113L, "janesmith@gmail.com");
//
//        System.out.println(newAddressBook.getContactList().size());
//        AddressBook.deleteContact(11111111113L);
//        System.out.println(newAddressBook.getContactList().size());
//
//        //edit contact
//        newAddressBook.addContact(newContact4);
//        System.out.println(newAddressBook.getContactList().size());
//        int index = AddressBook.getIndex(11111111113L);
//
//        Contact editContact = AddressBook.getUserToEdit(11111111113L);
//        editContact.setName("Mrs Beardsley");
//        editContact.setEmail("jjsmith@gmail.com");
//        editContact.setPhoneNumber(12345678912L);
//
//        newAddressBook.replaceContact(index, editContact);
//
//        Contact searchedForEdited = AddressBook.searchForUser("Mrs Beardsley");
//        printContact(searchedForEdited);
//
//    }
//
//    public static void printContact(Contact contact){
//        System.out.println("Contact: " + contact.getName() + "\n"
//                + "Phone Number: " + contact.getPhoneNumber() + "\n"
//                + "Email: " + contact.getEmail()
//        );
//    }
//}

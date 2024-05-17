package classes;
import java.util.ArrayList;

public class AddressBook {

    private int ID;
    private String username;
    private ArrayList<Contact> contactList;

    public AddressBook(int ID, String username) {
        this.ID = ID;
        this.username = username;
        this.contactList = new ArrayList<>(); // create ArrayList automatically
    }

    public int getID() { return ID; }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    public void addContact(Contact newContact) throws Exception {
        if (checkPhoneNumber(newContact.getPhoneNumber()) && checkEmail(newContact.getEmail())) {
            contactList.add(newContact);
        } else {
            throw new Exception("Duplicate phone numbers and emails are not allowed");
        }
    }

    public Contact searchForUser(String name) throws Exception {
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        throw new Exception("No contact found");
    }

    public Contact getUserToEdit(long number) throws Exception {
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber() == number) {
                return contact;
            }
        }
        throw new Exception("No contact found");
    }

    public int getIndex(long number) throws Exception {
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber() == number) {
                return contactList.indexOf(contact);
            }
        }
        throw new Exception("No contact found");
    }

    public boolean deleteContact(long number) throws Exception {

        if(contactList.removeIf(contact -> contact.getPhoneNumber() == number)){
            return true;
        }

        throw new Exception("No contact found");
    }

    public boolean checkPhoneNumber(long number) {
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber() == number) {
                return false;
            }
        }
        return true;
    }

    public boolean checkEmail(String email) {
        for (Contact contact : contactList) {
            if (contact.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public void replaceContact(int index, Contact contact) {
        contactList.set(index, contact);
    }

    public ArrayList<String> printContacts() {
        ArrayList<String> printOutput = new ArrayList<>();
        for (Contact contact : contactList) {
            String contactPrint = "Contact: " + contact.getName() + "\n"
                    + "Phone Number: " + contact.getPhoneNumber() + "\n"
                    + "Email: " + contact.getEmail(); // format String to save to arrayList
            printOutput.add(contactPrint);
        }
        return printOutput; // return new ArrayList of objects to print
    }
}

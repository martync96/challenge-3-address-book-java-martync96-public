package classes;

public class Contact{

    private int ID;
    private String name;
    private long phoneNumber;
    private String email;

    public Contact(int ID, String name, long phoneNumber, String email) {
        validateString(name);
        validateString(email);
        validateNumber(phoneNumber);
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static void validateString(String string)
    {
        if(string == null){
            throw new IllegalArgumentException("Property cannot be null");
        }
    }

    private static void validateNumber(long number)
    {
        long numberLength = Long.toString(number).length();
        if(numberLength != 11 ){
            throw new IllegalArgumentException("The phone number must be 11 digits long");
        }
    }
}
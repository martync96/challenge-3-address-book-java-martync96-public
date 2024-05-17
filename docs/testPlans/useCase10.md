# The user is able to view all contacts in the address book.

| Objects     | Properties         | Messages                        | Output  |
|-------------|--------------------|---------------------------------|---------|
| AddressBook | ID @Int            | getID()                         | Int     |
|             | userName @String   | setID()                         | Void    |
|             | contactList @Array | getUsername()                   | String  |
|             |                    | setUsername()                   | Void    |
|             |                    | addContact()                    | Void    |
|             |                    | getContactList()                | Void    |
|             |                    | deleteContact()                 | Void    |
|             |                    | checkPhoneNumber(long number)   | Boolean |
|             |                    | checkEmailAddress(String email) | Boolean |
|             |                    | printContacts()                 | Void    |
|             |                    |                                 |         |

# Test One: printOutput.size() is the same as contactList.size();
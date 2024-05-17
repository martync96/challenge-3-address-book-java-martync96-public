# A user is able to search for a contact by name

| Objects     | Properties         | Messages         | Output  |
|-------------|--------------------|------------------|---------|
| AddressBook | ID @Int            | getID()          | Int     |
|             | userName @String   | setID()          | Void    |
|             | contactList @Array | getUsername()    | String  |
|             |                    | setUsername()    | Void    |
|             |                    | addContact()     | Void    |
|             |                    | getContactList() | Void    |
|             |                    | searchForUser()  | contact |

| Objects       | Properties       | Messages              | Output |
|---------------|------------------|-----------------------|--------|
| userInterface | scanner @Scanner | printOptions()        | Void   |
|               |                  | getUserInput()        | Void   |
|               |                  | processUserInput(Int) | Void   | 
|               |                  |                       |        |

# Test One - searchForUser() returns a contact object from contactList if the input String matches contact.getName() of any of the objects

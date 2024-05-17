# A User should be able to edit a contact's user details

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
|             |                    | replaceContact()                | Void    |

| Objects       | Properties       | Messages           | Output |
|---------------|------------------|--------------------|--------|
| UserInterface | scanner @Scanner | printMenuOptions() | Void   |
|               |                  | getUserInput()     | Void   |
|               |                  | processUserInput() | Void   | 
|               |                  | printEditOptions() | Void   |
|               |                  |                    |        |

| Objects | Properties       | Messages         | Output |
|---------|------------------|------------------|--------|
| Contact | ID @Int          | getID()          | Int    |
|         | name @String     | setID()          | Void   |
|         | phoneNumber @Int | setName()        | Void   |
|         | email @String    | getName()        | String |
|         |                  | setPhoneNumber() | Void   |
|         |                  | getPhoneNumber() | Int    |
|         |                  | setEmail()       | Void   |
|         |                  | getEmail()       | String |
|         |                  |                  |        |

## getUserToEdit returns the correct Contact object

## getIndex returns correct index of Contact

## replaceContact() replaces the object at given index
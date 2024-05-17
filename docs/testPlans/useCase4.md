# A user must enter an email address when adding a new contact

| Objects     | Properties         | Messages         | Output |
|-------------|--------------------|------------------|--------|
| AddressBook | ID @Int            | getID()          | Int    |
|             | userName @String   | setID()          | Void   |
|             | contactList @Array | getUsername()    | String |
|             |                    | setUsername()    | Void   |
|             |                    | addContact()     | Void   |
|             |                    | getContactList() | Void   |
|             |                    |                  |        |

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

## Test One - addContact() only adds a contact object to the arrayList if an email has been set 
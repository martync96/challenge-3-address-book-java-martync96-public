# A user should be able to add a contact to their address book

| Objects     | Properties         | Messages         | Output |
|-------------|--------------------|------------------|--------|
| AddressBook | ID @Int            | getID()          | Int    |
|             | userName @String   | setID()          | Void   |
|             | contactList @Array | getUsername()    | String |
|             |                    | setUsername()    | Void   |
|             |                    | addContact()     | Void   |
|             |                    | getContactList() | Void   |
|             |                    |                  |        |

| Objects | Properties | Messages | Output |
|---------|------------|----------|--------|
| Contact | ID @Int    | getID()  | Int    |
|         |            | setID()  | Void   |
|         |            |          |        |

## Test One: addContact() increases the array length of contactList by +1.
# A user must enter a phone number when adding a new contact

| Objects     | Properties         | Messages         | Output |
|-------------|--------------------|------------------|--------|
| AddressBook | ID @Int            | getID()          | Int    |
|             | userName @String   | setID()          | Void   |
|             | contactList @Array | getUsername()    | String |
|             |                    | setUsername()    | Void   |
|             |                    | addContact()     | Void   |
|             |                    | getContactList() | Void   |
|             |                    |                  |        |

| Objects | Properties        | Messages         | Output |
|---------|-------------------|------------------|--------|
| Contact | ID @Int           | getID()          | Int    |
|         | name @String      | setID()          | Void   |
|         | phoneNumber @Int  | setName()        | Void   |
|         |                   | getName()        | String |
|         |                   | setPhoneNumber() | Void   |
|         |                   | getPhoneNumber() | Int    |
|         |                   |                  |        |

## Test One - setPhoneNumber() only sets phoneNumber if the input is 11 digits long

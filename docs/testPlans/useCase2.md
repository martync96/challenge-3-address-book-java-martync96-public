# A user must enter a name when adding a new contact

| Objects     | Properties         | Messages         | Output |
|-------------|--------------------|------------------|--------|
| AddressBook | ID @Int            | getID()          | Int    |
|             | userName @String   | setID()          | Void   |
|             | contactList @Array | getUsername()    | String |
|             |                    | setUsername()    | Void   |
|             |                    | addContact()     | Void   |
|             |                    | getContactList() | Void   |
|             |                    |                  |        |

| Objects | Properties   | Messages         | Output |
|---------|--------------|------------------|--------|
| Contact | ID @Int      | getID()          | Int    |
|         | name @String | setID()          | Void   |
|         |              | setName()        | Void   |
|         |              | getName()        | String |
|         |              | validateString() | Void   |

## Test One - setName() only sets a name if it is not null
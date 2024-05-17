# A user is not able to have duplicate phone numbers.

| Objects     | Properties         | Messages                 | Output  |
|-------------|--------------------|--------------------------|---------|
| AddressBook | ID @Int            | getID()                  | Int     |
|             | userName @String   | setID()                  | Void    |
|             | contactList @Array | getUsername()            | String  |
|             |                    | setUsername()            | Void    |
|             |                    | addContact()             | Void    |
|             |                    | getContactList()         | Void    |
|             |                    | deleteContact()          | Void    |
|             |                    | checkPhoneNumber(number) | Boolean |
|             |                    |                          |         |
|             |                    |                          |         |

# Test One - checkPhoneNumber returns false if number matches an entry in contactList
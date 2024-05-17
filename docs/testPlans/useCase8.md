# A user is not able to have duplicate emails. 

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
|             |                    |                                 |         |

| Objects | Properties        | Messages         | Output |
|---------|-------------------|------------------|--------|
| Contact | ID @int           | getID()          | Int    |
|         | name @String      | setID()          | Void   |
|         | phoneNumber @long | setName()        | Void   |
|         | email @String     | getName()        | String |
|         |                   | setPhoneNumber() | Void   |
|         |                   | getPhoneNumber() | long   |
|         |                   | setEmail()       | Void   |
|         |                   | getEmail()       | String |
|         |                   |                  |        |
|         |                   |                  |        |

# Test One - checkEmailAddress returns false if email and contact.getEmail() are equal
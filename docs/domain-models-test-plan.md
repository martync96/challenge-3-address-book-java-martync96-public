# User Stories and Domain Models

| Statement                                 | User Story                                                                  | Nouns                       | Verbs           |
|-------------------------------------------|-----------------------------------------------------------------------------|-----------------------------|-----------------|
| 1. A user should be able to add a contact | As a user, I want to be able to add new contacts to my address book,        | Address Book, Contact       | Add             |
| to the address book.                      | so I can keep track of all the people I know                                |                             |                 |
|                                           |                                                                             |                             |                 |
| 2. A user must enter a name when adding   | As a user, I want to be able to enter a name when adding contacts           | Contact, Address Book       | enter, identify |
| a new contact.                            | to my address book, so I can identify each contact by name                  |                             |                 |
|                                           |                                                                             |                             |                 |
| 3. A user must enter a phone number when  | As a user, I want to be able to enter a phone number when adding contacts   | Contact, Address Book       | enter, identify |
| adding a new contact.                     | to my address book, so I can identify each contact by their number          |                             |                 |
|                                           |                                                                             |                             |                 |
| 4. A user must enter an email address     | As a user, I want to be able to enter a email address when adding contacts  | Contact, Address Book       | enter, identify |
| when adding a new contact.                | to my address book, so I can identify each contact by their email           |                             |                 |
|                                           |                                                                             |                             |                 |
| 5. A user is able to search for a contact | As a user, I want to be able to search for contacts in my address book by   | Contact, Address Book       | search, find    |
| by name.                                  | name, so I can easily find people.                                          |                             |                 |
|                                           |                                                                             |                             |                 |
| 6. A user is able to remove a contact     | As a user, I want to be able to remove contacts from my address book, so    | Contact, Address Book       | remove          |
| from the address book.                    | I can remove unused contacts and save space.                                |                             |                 |
|                                           |                                                                             |                             |                 |
| 7. A user is not able to have duplicate   | As a user, I do not want my address book to have duplicate phone numbers,   | Contact, Phone Number,      |                 |
| phone numbers.                            | to ensure my address book is properly organised                             | Address Book                |                 |
|                                           |                                                                             |                             |                 |
| 8. A user is not able to have duplicate   | As a user, I do not want my address book to have duplicate email addresses, | Address Book, email address |                 |
| email addresses.                          | to ensure my address book is properly organised                             |                             |                 |
|                                           |                                                                             |                             |                 | 
| 9. A user should be able to edit a        | As a user, I want to be able to edit contacts in my address book, so I      | Address book, Contacts      |                 |
| contact's user details.                   | keep my address book up to date with any changes.                           |                             |                 |
|                                           |                                                                             |                             |                 |
| 10. The user is able to view all contacts | As a user, I want to be able to view all contacts in the address book, so   | Address Book, Contacts      | view            |
| in the address book                       | I can browse my address book.                                               |                             |                 |
|                                           |                                                                             |                             |                 |

| Objects     | Properties             | Messages                                              | Output      |
|-------------|------------------------|-------------------------------------------------------|-------------|
| AddressBook | ID @Int                | public getID()                                        | Int         |
|             | userName @String       | public setID()                                        | Void        |
|             | contactList @ArrayList | public getUsername()                                  | String      |
|             |                        | public setUsername()                                  | Void        |
|             |                        | addContact(Contact contact)                           | Void        |
|             |                        | public getContactList()                               | ArrayList<> |
|             |                        | public setContactList(ArrayList<Contact> contactList) | Void        |
|             |                        | public addContact(Contact newContact)                 | Void        |
|             |                        | public static searchForUser(String name)              | String      |
|             |                        | public static getIndex (long number)                  | int         |
|             |                        | public static deleteContact(long number)              | int         |
|             |                        | public checkPhoneNumber(long number)                  | Boolean     |
|             |                        | public checkEmail(String email)                       | Boolean     |
|             |                        | public replaceContent(int index, Contact contact)     | Void        |
|             |                        | public printContacts()                                | ArrayList<> |
|             |                        |                                                       |             |



| Objects | Properties       | Messages                                     | Output |
|---------|------------------|----------------------------------------------|--------|
| Contact | ID @Int          | getID()                                      | Int    |
|         | name @String     | setID()                                      | Void   |
|         | phoneNumber @Int | setName()                                    | Void   |
|         | email @String    | getName()                                    | String |
|         |                  | setPhoneNumber()                             | Void   |
|         |                  | getPhoneNumber()                             | Int    |
|         |                  | setEmail()                                   | Void   |
|         |                  | getEmail()                                   | String |
|         |                  | private static validateString(String string) | Void   |
|         |                  | private static validateNumber(long number)   | Void   |
|         |                  |                                              |        |
|         |                  |                                              |        |

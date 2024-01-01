package seminars.five.HWphonebook;

public class UserInterface {
    PhoneBook phoneBook;

    public UserInterface(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

   public void userAddContact(String name, String surname){
        phoneBook.addContact(name, surname);
    }
   public void userEditContact(String name){
        phoneBook.editContact(name);
    }

   public void userDeleteContact(String name){
        phoneBook.deleteContact(name);
    }
   public Contact userFindByName(String name){
       return phoneBook.findByName(name);
    }
}

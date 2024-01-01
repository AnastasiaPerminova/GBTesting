package seminars.five.HWphonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    public List<Contact> contacts ;

    public PhoneBook(){
        this.contacts = new ArrayList<>() ;
    };

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
    }
    public void editContact(String name){
        Contact contact = findByName(name);
        contact.setName("Изменено");
        contact.setPhoneNumber("Изменен");
        contacts.add(contact);

    };

    public void deleteContact(String name){
        //Логика удаления контакта

    };


    public List<Contact>  findAllContacts(){
        return contacts;
    }
   public  Contact findByName(String name){
        //Обращение к списку контаков
        Contact contact = new Contact("Найденный по имени контакт", "1111111");
        return contact;
    }

   public Contact findById(String Id){
        //Обращение к списку контаков
        Contact contact = new Contact("Найденный по ID контакт", "1111111");

        return contact;
    }


}

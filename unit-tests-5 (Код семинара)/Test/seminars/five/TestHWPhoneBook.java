package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.HWphonebook.Contact;
import seminars.five.HWphonebook.PhoneBook;
import seminars.five.HWphonebook.UserInterface;
import seminars.third.tdd.UserRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class TestHWPhoneBook {

    PhoneBook phoneBook = new PhoneBook();
    Contact contact = new Contact("Тестовый", "121212");
    Contact contact1 = new Contact("Тестовый 2", "121323");
    //1. Cначала необходимо провести unit-тесты для проверки отдельных модулей классов Contact, PhoneBook(проверить выполнение функций добавить контакт, редактировать контакт,
    //удалить контакт, найти контакт), UserInterface(проверить работу функций добавить контакт, редактировать контакт,
    // удалить контакт, найти контакт через интерфейс пользователя)

    //Примеры unit-тестов.

    @Test
    void testAddContactPb(){
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact("Тестовый", "121212");

        phoneBook.addContact("Тестовый","121212");

        assertEquals(contact, phoneBook.contacts.get(0));
    }
    @Test
    void testEditContactPb(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.editContact("Тест");
        assertTrue(phoneBook.contacts.contains(new Contact("Изменено", "Изменен")));
    }

    @Test
    void testAddContactUI(){
        PhoneBook mockedPhoneBook = mock(PhoneBook.class);
        UserInterface userInterface = new UserInterface(mockedPhoneBook);
        userInterface.userAddContact("Тестовый", "121212");
        verify(mockedPhoneBook, times(1)).addContact("Тестовый", "121212");
    }

    @Test
    void testEditContactUI(){
        PhoneBook mockedPhoneBook = mock(PhoneBook.class);
        UserInterface userInterface = new UserInterface(mockedPhoneBook);
        userInterface.userEditContact("Тест");
        verify(mockedPhoneBook, times(1)).editContact("Тест");

    }
    //2. Необходимо провести интеграционные тесты для проверки совместной работы компонентов Contact, PhoneBook и UserInterface.

    //Примеры интеграционных тестов.

    @Test
    void testAddContactPBUI(){
        PhoneBook phoneBook = new PhoneBook();
        UserInterface userInterface = new UserInterface(phoneBook);
        userInterface.userAddContact("Тест", "Тестовый");
        assertTrue(phoneBook.contacts.contains(new Contact("Тест","Тестовый")));
    }
    @Test
    void testEditContactPBIU(){
        PhoneBook phoneBook = new PhoneBook();
        UserInterface userInterface = new UserInterface(phoneBook);
        userInterface.userEditContact("Тест");
        assertTrue(phoneBook.contacts.contains(new Contact("Изменено", "Изменен")));
    }

    //3.  Затем проводится при создании приложения проводится сквозное тестирование, проверяющее работу всего приложения
    // от начала(пользовательский интерфейс) до конца(создание, редактирование, удаление) конкретного контакта.
}


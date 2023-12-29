package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

class BookServiceTest {


        BookRepository mockedBookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(mockedBookRepository);

    @Test
    void testFindBookById(){
        bookService.findBookById("1");
        verify(mockedBookRepository, times(1)).findById("1");

    }

    @Test
    void testFindAllBooks(){
        bookService.findAllBooks();
        verify(mockedBookRepository, times(1)).findAll();
    }
}
package fourth.book;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class BookServiceTest {
    @Test
    public void testFindBookById() {
        // Создание mock-объекта BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Создание объекта BookService с использованием mock-объекта BookRepository
        BookService bookService = new BookService(bookRepository);

        // Настройка поведения mock-объекта
        Book expectedBook = new Book("12345", "Book Title","sdfsfsdf","sdfsfsdfsdfs");
        when(bookRepository.findById("12345")).thenReturn(expectedBook);

        // Вызов тестируемого метода
        Book result = bookService.findBookById("12345");

        // Проверка полученного результата
        assertEquals(expectedBook, result);

        // Проверка вызова метода у mock-объекта
        verify(bookRepository).findById("12345");
    }

    @Test
    public void testFindAllBooks() {
        // Создание mock-объекта BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Создание объекта BookService с использованием mock-объекта BookRepository
        BookService bookService = new BookService(bookRepository);

        // Настройка поведения mock-объекта
        List<Book> expectedBooks = new ArrayList<Book>();
        expectedBooks.add(new Book("12345", "Book Title","sdfsfsdf","sdfsfsdfsdfs"));
        expectedBooks.add(new Book("125", "Book Title","sdfsfsdf","sdfsfsdfsdfs"));
        when(bookRepository.findAll()).thenReturn(expectedBooks);

        // Вызов тестируемого метода
        List<Book> result = bookService.findAllBooks();

        // Проверка полученного результата
        assertEquals(expectedBooks, result);

        // Проверка вызова метода у mock-объекта
        verify(bookRepository).findAll();
    }

}

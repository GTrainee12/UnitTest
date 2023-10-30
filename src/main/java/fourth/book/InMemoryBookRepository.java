package fourth.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryBookRepository implements BookRepository  {
    private final Map<String, Book> books;

    public InMemoryBookRepository() {
        this.books = new HashMap<>();
        books.put("1", new Book("1", "1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?"
                ,"Test Double (Тестовая заглушка)",
                "Использование тестовых заглушек может быть полезным при написании модульных тестов,\n" +
                "так как они позволяют изолировать тестируемый модуль от зависимостей.\n" +
                "Вместо реальных зависимостей, которые могут быть сложными или медленными в использовании в тестах,\n" +
                "мы создаем заглушки, которые имитируют нужное поведение и возвращают нужные значения.\n" +
                "Это позволяет эффективно и быстро проверять работу модуля.\n"));

        books.put("2", new Book("2", "2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить," +
                "что метод был вызван с определенными аргументами?",
                "Mock (Имитация)",
                "Для проверки вызова метода с определенными аргументами следует использовать mock-объекты.\n" +
                "Mockito обладает возможностями создания и использования мок-объектов для проверки вызовов методов с определенными значениями аргументов.\n"));

        books.put("3",new Book("3","3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?",
                "Stub (Заглушки)",
                "Для возвращения определенного значения или исключения в ответ на вызов метода, следует использовать stub-объекты.\n" +
                        "Mockito позволяет стабилизировать поведение методов мок-объекта с помощью методов типа 'when-then'.\n"));

        books.put("4",new Book("4","4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?",
                "Spy (Шпионы)",
                "Для имитации взаимодействия с внешним API или базой данных можно использовать spy-объекты. Mockito предоставляет возможность создания spy-объектов,\n" +
                        "которые позволяют делать реальные вызовы методов, но также могут быть настроены для возврата заданных значений или перехвата вызовов.\n"));

    }

    @Override
    public Book findById(String id) {
        return books.get(id);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

        public static void main(String[] args) {
        BookRepository repository = new InMemoryBookRepository();
        BookService bookService = new BookService(repository);


        List<Book> allBooks = bookService.findAllBooks();
        System.out.println("Урок 4. Зависимости в тестах:");
        System.out.println("Вопросы:");
        for (Book book : allBooks) {
            System.out.println("- " + book.getTitle() + "\n" + book.getAuthor()+"\n"+ book.getСontent());
        }
    }
}

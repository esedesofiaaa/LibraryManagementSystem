import org.example.Book;
import org.example.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class BookTest {
    private Book book1, book2;

    @Test
    void testMarkAsUnavailable() {
        Book book1 = new Book("01", "Libro 1", "Pepito Perez");
        book1.markAsUnavailable();
        assertEquals(false, book1.isAvailable());
    }

    @Test
    void testMarkAsAvailable() {
        Book book2= new Book("02", "Libro 2", "Pepito Perez");
        assertEquals(true, book2.isAvailable());
    }
}

import org.example.Book;
import org.example.LoanManager;
import org.example.Student;
import org.example.LibraryDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class LoanManagerTest {
    private LoanManager sofia;
    private Book book1;
    private Student student;
    private LibraryDatabase libraryDatabaseMock;

    @BeforeEach
    public void setUp() {
        libraryDatabaseMock = mock(LibraryDatabase.class);
        sofia = new LoanManager(libraryDatabaseMock);
    }

   @Test
   void TestLendBook (){
       student = new Student("123", "John Doe");
       book1 = new Book("B001", "Effective Java", "Joshua Bloch");

   }
}

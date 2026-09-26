package mediator;

import colleague.Student;
import model.Book;

public interface Mediator {

    void requestLoan(Student student, Book book);

    void returnBook(Student student, Book book);
}

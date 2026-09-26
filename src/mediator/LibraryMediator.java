package mediator;

import colleague.Student;
import model.Book;

public class LibraryMediator implements Mediator {

    @Override
    public void requestLoan(Student student, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Library: loan approved for " + student.getName() + ".");
        } else {
            System.out.println("Library: the book is not available.");
        }
    }

    @Override
    public void returnBook(Student student, Book book) {
        book.setAvailable(true);
        System.out.println("Library: book available again.");
    }
}

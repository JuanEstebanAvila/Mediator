package colleague;

import mediator.Mediator;
import model.Book;

public class Student {

    private final String name;
    private final Mediator mediator;

    public Student(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void requestBook(Book book) {
        System.out.println(name + " requests the book \"" + book.getTitle() + "\".");
        mediator.requestLoan(this, book);
    }

    public void returnBook(Book book) {
        System.out.println(name + " returns the book \"" + book.getTitle() + "\".");
        mediator.returnBook(this, book);
    }
}

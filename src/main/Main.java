package main;

import colleague.Student;
import mediator.LibraryMediator;
import mediator.Mediator;
import model.Book;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new LibraryMediator();

        Book book = new Book("Design Patterns");

        Student ana = new Student("Maria", mediator);
        Student carlos = new Student("Mauricio", mediator);

        ana.requestBook(book);      
        carlos.requestBook(book);    
        ana.returnBook(book);        
        carlos.requestBook(book);    
}
}

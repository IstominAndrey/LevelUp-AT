package repository;

import domain.Book;
import domain.Publisher;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@RequiredArgsConstructor
public class BookRepository {

    private final SessionFactory factory;

    public Book createBook(String name, String isbn, Integer year, Integer publisher_id) {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Book book = new Book (name, isbn, year, publisher_id);
        session.persist(book);

        transaction.commit();
        session.close();

        return book;
    }



}

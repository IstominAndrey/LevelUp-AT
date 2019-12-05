
import domain.Book;
import domain.Publisher;
import org.hibernate.SessionFactory;
import repository.BookRepository;
import repository.PublisherRepository;


public class App {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtils.getFactory();

//        PublisherRepository publisherRepository = new PublisherRepository(factory);

//        Publisher publisher = publisherRepository.createPublisher("Москва 4.0");

//        publisherRepository.updatePublisher(publisher.getId(), "Москва 5.0");

        BookRepository bookRepository = new BookRepository(factory);

        Book book = bookRepository.createBook("Book", "222-222", 1984, 2);
//                bookRepository.createBook("Книга", "222-222", 1984, 4);

        factory.close();

    }

}


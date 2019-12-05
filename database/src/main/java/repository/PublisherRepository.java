package repository;

import domain.Publisher;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@RequiredArgsConstructor
public class PublisherRepository {

    private final SessionFactory factory;

    public Publisher createPublisher(String name) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Publisher publisher = new Publisher(name);
        session.persist(publisher);

        transaction.commit();
        session.close();

        // publisher
        return publisher;
    }

    public Publisher updatePublisher(Integer id, String name) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Publisher publisher = session.get(Publisher.class, id);
        publisher.setName(name);

        // session.merge(publisher);
        transaction.commit();
        session.close();

        return publisher;
    }

}

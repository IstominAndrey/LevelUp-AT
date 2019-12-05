import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static SessionFactory factory;

    private HibernateUtils() {}

    static {
        Configuration configuration = new Configuration()
                .configure();
        factory = configuration.buildSessionFactory();
    }

    public static SessionFactory getFactory() {
        return factory;
    }

}

package connection;

import model.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactorySingleton {
    private static class LazyHolder {
        static SessionFactory INSTANCE;

        static {
            var registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();

            INSTANCE = new MetadataSources(registry)
                    .addAnnotatedClass(Student.class)
                    .addAnnotatedClass(Mortgage.class)
                    .addAnnotatedClass(PaidInstallments.class)
                    .addAnnotatedClass(UnpaidInstallments.class)
                    .addAnnotatedClass(EducationLoan.class)
                    .addAnnotatedClass(TuitionLoan.class)
                    .addAnnotatedClass(WifeOrHusband.class)
                    .buildMetadata()
                    .buildSessionFactory();
        }
    }

    public static SessionFactory getInstance() {
        return LazyHolder.INSTANCE;
    }
}

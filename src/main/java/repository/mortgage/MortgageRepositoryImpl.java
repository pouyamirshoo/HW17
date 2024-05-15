package repository.mortgage;

import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import model.Mortgage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class MortgageRepositoryImpl extends BaseRepositoryImpl<Mortgage, Long> implements MortgageRepository {
    public MortgageRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Mortgage> getEntityClass() {
        return Mortgage.class;
    }

    @Override
    public Mortgage mortgage(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<Mortgage> query = session.createQuery(" FROM Mortgage m WHERE m.student.id =:id",
                Mortgage.class);
        query.setParameter("id", id);
        Mortgage mortgage = query.uniqueResult();
        session.close();
        return mortgage;
    }
}

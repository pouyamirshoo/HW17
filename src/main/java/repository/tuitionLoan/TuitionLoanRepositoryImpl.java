package repository.tuitionLoan;

import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import model.TuitionLoan;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class TuitionLoanRepositoryImpl extends BaseRepositoryImpl<TuitionLoan, Long>
        implements TuitionLoanRepository {
    public TuitionLoanRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<TuitionLoan> getEntityClass() {
        return TuitionLoan.class;
    }

    @Override
    public List<TuitionLoan> TuitionLoans(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<TuitionLoan> query = session.createQuery(" FROM TuitionLoan t WHERE t.student.id =:id",
                TuitionLoan.class);
        query.setParameter("id", id);
        List<TuitionLoan> tuitionLoans = query.list();
        session.close();
        return tuitionLoans;
    }
}

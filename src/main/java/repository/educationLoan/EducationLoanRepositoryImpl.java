package repository.educationLoan;

import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import model.EducationLoan;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class EducationLoanRepositoryImpl extends BaseRepositoryImpl<EducationLoan, Long>
        implements EducationLoanRepository {
    public EducationLoanRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<EducationLoan> getEntityClass() {
        return EducationLoan.class;
    }

    @Override
    public List<EducationLoan> educationLoans(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<EducationLoan> query = session.createQuery(" FROM EducationLoan e WHERE e.student.id =:id",
                EducationLoan.class);
        query.setParameter("id", id);
        List<EducationLoan> educationLoans = query.list();
        session.close();
        return educationLoans;
    }
}

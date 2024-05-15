package repository.unpaidInstallments;

import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import model.UnpaidInstallments;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class UnpaidInstallmentsRepositoryImpl extends BaseRepositoryImpl<UnpaidInstallments, Long>
        implements UnpaidInstallmentsRepository {
    public UnpaidInstallmentsRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<UnpaidInstallments> getEntityClass() {
        return UnpaidInstallments.class;
    }

    @Override
    public List<UnpaidInstallments> unpaidInstallmentsEducation(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<UnpaidInstallments> query = session.createQuery(" FROM UnpaidInstallments u WHERE u.educationLoan.id =:id",
                UnpaidInstallments.class);
        query.setParameter("id", id);
        List<UnpaidInstallments> unpaidInstallments = query.list();
        session.close();
        return unpaidInstallments;
    }

    @Override
    public List<UnpaidInstallments> unpaidInstallmentsTuition(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<UnpaidInstallments> query = session.createQuery(" FROM UnpaidInstallments u WHERE u.tuitionLoan.id =:id",
                UnpaidInstallments.class);
        query.setParameter("id", id);
        List<UnpaidInstallments> unpaidInstallments = query.list();
        session.close();
        return unpaidInstallments;
    }

    @Override
    public List<UnpaidInstallments> unpaidInstallmentsMortgage(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<UnpaidInstallments> query = session.createQuery(" FROM UnpaidInstallments u WHERE u.mortgage.id =:id",
                UnpaidInstallments.class);
        query.setParameter("id", id);
        List<UnpaidInstallments> unpaidInstallments = query.list();
        session.close();
        return unpaidInstallments;
    }
}

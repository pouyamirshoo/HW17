package repository.paidInstallments;

import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import model.PaidInstallments;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class PaidInstallmentsRepositoryImpl extends BaseRepositoryImpl<PaidInstallments, Long>
        implements PaidInstallmentsRepository {
    public PaidInstallmentsRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<PaidInstallments> getEntityClass() {
        return PaidInstallments.class;
    }

    @Override
    public List<PaidInstallments> paidInstallmentsEducation(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<PaidInstallments> query = session.createQuery(" FROM PaidInstallments u WHERE u.educationLoan.id =:id",
                PaidInstallments.class);
        query.setParameter("id", id);
        List<PaidInstallments> paidInstallments = query.list();
        session.close();
        return paidInstallments;
    }

    @Override
    public List<PaidInstallments> paidInstallmentsTuition(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<PaidInstallments> query = session.createQuery(" FROM PaidInstallments u WHERE u.tuitionLoan.id =:id",
                PaidInstallments.class);
        query.setParameter("id", id);
        List<PaidInstallments> paidInstallments = query.list();
        session.close();
        return paidInstallments;
    }

    @Override
    public List<PaidInstallments> paidInstallmentsMortgage(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<PaidInstallments> query = session.createQuery(" FROM PaidInstallments u WHERE u.mortgage.id =:id",
                PaidInstallments.class);
        query.setParameter("id", id);
        List<PaidInstallments> paidInstallments = query.list();
        session.close();
        return paidInstallments;
    }
}


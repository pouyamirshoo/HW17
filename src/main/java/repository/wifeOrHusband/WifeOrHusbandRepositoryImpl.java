package repository.wifeOrHusband;

import base.repository.BaseRepositoryImpl;
import connection.SessionFactorySingleton;
import model.WifeOrHusband;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class WifeOrHusbandRepositoryImpl extends BaseRepositoryImpl<WifeOrHusband, Long>
        implements WifeOrHusbandRepository {
    public WifeOrHusbandRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<WifeOrHusband> getEntityClass() {
        return WifeOrHusband.class;
    }

    @Override
    public WifeOrHusband findByStudentId(Long id) {
        Session session = SessionFactorySingleton.getInstance().openSession();
        Query<WifeOrHusband> query = session.createQuery(" FROM WifeOrHusband w WHERE w.student.id =:id",
                WifeOrHusband.class);
        query.setParameter("id", id);
        WifeOrHusband wifeOrHusband = query.uniqueResult();
        session.close();
        return wifeOrHusband;
    }
}

package service.tuitionLoan;

import base.service.BaseServiceImpl;
import model.TuitionLoan;
import org.hibernate.SessionFactory;
import repository.tuitionLoan.TuitionLoanRepository;

import java.util.List;

public class TuitionLoanServiceImpl extends BaseServiceImpl<TuitionLoan, Long, TuitionLoanRepository>
        implements TuitionLoanService {
    public TuitionLoanServiceImpl(TuitionLoanRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }

    @Override
    public List<TuitionLoan> tuitionLoans(Long id) {
        return repository.TuitionLoans(id);
    }
}

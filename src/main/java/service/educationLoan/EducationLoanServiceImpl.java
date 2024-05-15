package service.educationLoan;

import base.service.BaseServiceImpl;
import model.EducationLoan;
import org.hibernate.SessionFactory;
import repository.educationLoan.EducationLoanRepository;

import java.util.List;

public class EducationLoanServiceImpl extends BaseServiceImpl<EducationLoan, Long, EducationLoanRepository>
        implements EducationLoanService {
    public EducationLoanServiceImpl(EducationLoanRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }

    @Override
    public List<EducationLoan> educationLoans(Long id) {
        return repository.educationLoans(id);
    }
}

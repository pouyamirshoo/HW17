package service.mortgage;

import base.service.BaseServiceImpl;
import model.Mortgage;
import org.hibernate.SessionFactory;
import repository.mortgage.MortgageRepository;

public class MortgageServiceImpl extends BaseServiceImpl<Mortgage, Long, MortgageRepository>
        implements MortgageService {
    public MortgageServiceImpl(MortgageRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }

    @Override
    public Mortgage mortgage(Long id) {
        return repository.mortgage(id);
    }
}

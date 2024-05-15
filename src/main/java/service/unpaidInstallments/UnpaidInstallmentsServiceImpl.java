package service.unpaidInstallments;

import base.service.BaseServiceImpl;
import model.UnpaidInstallments;
import org.hibernate.SessionFactory;
import repository.unpaidInstallments.UnpaidInstallmentsRepository;

import java.util.List;

public class UnpaidInstallmentsServiceImpl extends BaseServiceImpl<UnpaidInstallments, Long, UnpaidInstallmentsRepository>
        implements UnpaidInstallmentsService {
    public UnpaidInstallmentsServiceImpl(UnpaidInstallmentsRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }

    @Override
    public List<UnpaidInstallments> unpaidInstallmentsEducation(Long id) {
        return repository.unpaidInstallmentsEducation(id);
    }

    @Override
    public List<UnpaidInstallments> unpaidInstallmentsTuition(Long id) {
        return repository.unpaidInstallmentsTuition(id);
    }

    @Override
    public List<UnpaidInstallments> unpaidInstallmentsMortgage(Long id) {
        return repository.unpaidInstallmentsMortgage(id);
    }
}

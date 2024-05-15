package service.paidInstallments;

import base.service.BaseServiceImpl;
import model.PaidInstallments;
import org.hibernate.SessionFactory;
import repository.paidInstallments.PaidInstallmentsRepository;

import java.util.List;

public class PaidInstallmentsServiceImpl extends BaseServiceImpl<PaidInstallments, Long, PaidInstallmentsRepository>
        implements PaidInstallmentsService {
    public PaidInstallmentsServiceImpl(PaidInstallmentsRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }

    @Override
    public List<PaidInstallments> paidInstallmentsEducation(Long id) {
        return repository.paidInstallmentsEducation(id);
    }

    @Override
    public List<PaidInstallments> paidInstallmentsTuition(Long id) {
        return repository.paidInstallmentsTuition(id);
    }

    @Override
    public List<PaidInstallments> paidInstallmentsMortgage(Long id) {
        return repository.paidInstallmentsMortgage(id);
    }
}

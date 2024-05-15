package repository.paidInstallments;

import base.repository.BaseRepository;
import model.PaidInstallments;

import java.util.List;

public interface PaidInstallmentsRepository extends BaseRepository<PaidInstallments, Long> {
    List<PaidInstallments> paidInstallmentsEducation(Long id);

    List<PaidInstallments> paidInstallmentsTuition(Long id);

    List<PaidInstallments> paidInstallmentsMortgage(Long id);
}

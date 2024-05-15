package repository.unpaidInstallments;

import base.repository.BaseRepository;
import model.UnpaidInstallments;

import java.util.List;

public interface UnpaidInstallmentsRepository extends BaseRepository<UnpaidInstallments, Long> {

    List<UnpaidInstallments> unpaidInstallmentsEducation(Long id);

    List<UnpaidInstallments> unpaidInstallmentsTuition(Long id);

    List<UnpaidInstallments> unpaidInstallmentsMortgage(Long id);
}


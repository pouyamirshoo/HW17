package service.unpaidInstallments;

import base.service.BaseService;
import model.UnpaidInstallments;

import java.util.List;

public interface UnpaidInstallmentsService extends BaseService<UnpaidInstallments, Long> {
    List<UnpaidInstallments> unpaidInstallmentsEducation(Long id);

    List<UnpaidInstallments> unpaidInstallmentsTuition(Long id);

    List<UnpaidInstallments> unpaidInstallmentsMortgage(Long id);
}

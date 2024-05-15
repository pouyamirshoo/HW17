package service.paidInstallments;

import base.service.BaseService;
import model.PaidInstallments;

import java.util.List;

public interface PaidInstallmentsService extends BaseService<PaidInstallments, Long> {
    List<PaidInstallments> paidInstallmentsEducation(Long id);

    List<PaidInstallments> paidInstallmentsTuition(Long id);

    List<PaidInstallments> paidInstallmentsMortgage(Long id);
}

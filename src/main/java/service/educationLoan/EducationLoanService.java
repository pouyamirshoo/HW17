package service.educationLoan;

import base.service.BaseService;
import model.EducationLoan;

import java.util.List;

public interface EducationLoanService extends BaseService<EducationLoan, Long> {

    List<EducationLoan> educationLoans(Long id);
}

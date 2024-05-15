package service.tuitionLoan;

import base.service.BaseService;
import model.TuitionLoan;

import java.util.List;

public interface TuitionLoanService extends BaseService<TuitionLoan, Long> {
    List<TuitionLoan> tuitionLoans(Long id);
}

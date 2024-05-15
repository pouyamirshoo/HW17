package repository.tuitionLoan;

import base.repository.BaseRepository;
import model.TuitionLoan;

import java.util.List;

public interface TuitionLoanRepository extends BaseRepository<TuitionLoan, Long> {
    List<TuitionLoan> TuitionLoans(Long id);
}

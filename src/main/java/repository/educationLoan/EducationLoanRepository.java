package repository.educationLoan;

import base.repository.BaseRepository;
import model.EducationLoan;

import java.util.List;

public interface EducationLoanRepository extends BaseRepository<EducationLoan,Long> {

    List<EducationLoan> educationLoans(Long id);
}

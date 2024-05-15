package repository.mortgage;

import base.repository.BaseRepository;
import model.Mortgage;

public interface MortgageRepository extends BaseRepository<Mortgage, Long> {
    Mortgage mortgage(Long id);
}

package service.mortgage;

import base.service.BaseService;
import model.Mortgage;

public interface MortgageService extends BaseService<Mortgage, Long> {
    Mortgage mortgage(Long id);
}

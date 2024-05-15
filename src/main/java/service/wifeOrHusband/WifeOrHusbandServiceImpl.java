package service.wifeOrHusband;

import base.service.BaseServiceImpl;
import model.WifeOrHusband;
import org.hibernate.SessionFactory;
import repository.wifeOrHusband.WifeOrHusbandRepository;

public class WifeOrHusbandServiceImpl extends BaseServiceImpl<WifeOrHusband, Long, WifeOrHusbandRepository>
        implements WifeOrHusbandService {
    public WifeOrHusbandServiceImpl(WifeOrHusbandRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }

    @Override
    public WifeOrHusband findByStudentId(Long id) {
        return repository.findByStudentId(id);
    }
}

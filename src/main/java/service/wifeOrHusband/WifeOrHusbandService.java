package service.wifeOrHusband;

import base.service.BaseService;
import model.WifeOrHusband;

public interface WifeOrHusbandService extends BaseService<WifeOrHusband, Long> {
    WifeOrHusband findByStudentId(Long id);
}

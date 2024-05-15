package repository.wifeOrHusband;

import base.repository.BaseRepository;
import model.WifeOrHusband;

public interface WifeOrHusbandRepository extends BaseRepository<WifeOrHusband, Long> {

    WifeOrHusband findByStudentId(Long id);
}

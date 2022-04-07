package com.jessmorse.bntaapi.consultant;

import java.util.List;
import java.util.Optional;

public interface ConsultantDAO {

    void addConsultant(Consultant consultant);
    List<Consultant> viewAllConsultants();
    Optional<Consultant> getConsultantById(int consultantId);
    void updateConsultantLocation(int consultantId, String location);
    void updateConsultantDetails(int consultantId, Consultant consultant);

}

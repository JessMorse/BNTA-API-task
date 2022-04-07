package com.jessmorse.bntaapi.consultant;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultantService {

    private ConsultantDAO consultantDAO;

    public ConsultantService(@Qualifier("consultant") ConsultantDAO consultantDAO) {
        this.consultantDAO = consultantDAO;
    }

    public void addConsultant(Consultant consultant){
        consultantDAO.addConsultant(consultant);
    };

    public List<Consultant> viewAllConsultants(){
        return consultantDAO.viewAllConsultants();
    };

    public Optional<Consultant> getConsultantById(int consultantId){
        return consultantDAO.getConsultantById(consultantId);
    };

    public void updateConsultantLocation(int consultantId, String location){
        consultantDAO.updateConsultantLocation(consultantId, location);
    };

    public void updateConsultantDetails(int consultantId, Consultant consultant){
        consultantDAO.updateConsultantDetails(consultantId, consultant);
    };
}

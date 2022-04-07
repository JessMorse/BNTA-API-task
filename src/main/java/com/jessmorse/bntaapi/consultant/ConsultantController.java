package com.jessmorse.bntaapi.consultant;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consultant")
public class ConsultantController {

    private ConsultantService consultantService;

    public ConsultantController(ConsultantService consultantService) {
        this.consultantService = consultantService;
    }

    @PostMapping
    public void addConsultant(@RequestBody Consultant consultant){
        consultantService.addConsultant(consultant);
    };

    @GetMapping
    public List<Consultant> viewAllConsultants(){
        return consultantService.viewAllConsultants();
    };

    @GetMapping("{id}")
    public Optional<Consultant> getConsultantById(@PathVariable("id")int consultantId){
        return consultantService.getConsultantById(consultantId);
    };

    @PutMapping("location/{id}")
    public void updateConsultantLocation(@PathVariable("id") int consultantId, String location){
        consultantService.updateConsultantLocation(consultantId, location);
    };

    @PutMapping("update/{id}")
    public void updateConsultantDetails(int consultantId, Consultant consultant){
        consultantService.updateConsultantDetails(consultantId, consultant);
    };
}

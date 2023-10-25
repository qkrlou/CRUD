package com.uap.it1311l.registrationapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.it1311l.registrationapi.model.Attendee;
import com.uap.it1311l.registrationapi.repository.RegistrationMybatisRepository;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationMybatisRepository registrationRepo;
	
	@PostMapping("/event/register")
	public Attendee register(@RequestBody Attendee student) {
		registrationRepo.insert(student);
		return student; 
	}
	
	@GetMapping("/attendees")
    public List<Attendee> getList() {
        return registrationRepo.findAll();
    }
	
	@PutMapping("/event/survey/eligibility")
    public List<Attendee> markBSITEligibleForSurvey() {
        registrationRepo.markBSITEligibleForSurvey();
        return registrationRepo.findAll(); 
    }

    @DeleteMapping("/event/registration/{id}")
    public String deleteAttendee(@PathVariable String id) {
        int deletedRows = registrationRepo.deleteById(id);
        if (deletedRows > 0) {
            return "ID " + id + " deleted successfully.";
        } else {
            return " ID " + id + " could not be deleted.";
        }
    } 
}
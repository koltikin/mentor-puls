package com.cydeo.mentor_plus.controller;

import com.cydeo.mentor_plus.entities.Mentor;
import com.cydeo.mentor_plus.entities.ResponseWrapper;
import com.cydeo.mentor_plus.services.MentorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/mentors")
@CrossOrigin
public class MentorController {

    private final MentorService mentorService;

    public MentorController(MentorService mentorService) {
        this.mentorService = mentorService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getMentors(){
        var mentors = mentorService.getAllMentors();
        return ResponseEntity.ok(new ResponseWrapper("Mentors retrieved successfully", mentors, HttpStatus.OK));
    }

}

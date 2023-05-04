package com.cydeo.mentor_plus.services;

import com.cydeo.mentor_plus.entities.Mentor;
import com.cydeo.mentor_plus.repository.MentorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorService {

    private final MentorRepository mentorRepository;

    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public List<Mentor> getAllMentors(){
        return mentorRepository.findAll();
    }
}

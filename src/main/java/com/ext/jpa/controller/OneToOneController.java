package com.ext.jpa.controller;

import com.ext.jpa.model.onetoone.Gender;
import com.ext.jpa.model.onetoone.User;
import com.ext.jpa.model.onetoone.UserProfile;
import com.ext.jpa.repo.onetoone.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@RequestMapping("/api")
public class OneToOneController {
    @Autowired
    private UserRepo userRepo;
    public String saveUser(){
        // Create a User instance
        User user = new User("Rajeev", "Singh", "rajeev@callicoder.com",
                "MY_SUPER_SECRET_PASSWORD");

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1992, 7, 21);

        // Create a UserProfile instance
        UserProfile userProfile = new UserProfile("+91-8197882053", Gender.MALE, dateOfBirth.getTime(),
                "747", "2nd Cross", "Golf View Road, Kodihalli", "Bangalore",
                "Karnataka", "India", "560008");


        // Set child reference(userProfile) in parent entity(user)
        user.setUserProfile(userProfile);

        // Set parent reference(user) in child entity(userProfile)
        userProfile.setUser(user);

        // Save Parent Reference (which will save the child as well)
        userRepo.save(user);
        return "";
    }
}

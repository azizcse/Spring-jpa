package com.ext.jpa.controller;

import com.ext.jpa.model.element.ElementAddress;
import com.ext.jpa.model.element.ElementUser;

import java.util.HashSet;
import java.util.Set;

public class ElementController {
    public String save(){
        // Insert a user with multiple phone numbers and addresses.
        Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.add("+91-9999999999");
        phoneNumbers.add("+91-9898989898");

        Set<ElementAddress> addresses = new HashSet<>();
        addresses.add(new ElementAddress("747", "Golf View Road", "Bangalore",
                "Karnataka", "India", "560008"));
        addresses.add(new ElementAddress("Plot No 44", "Electronic City", "Bangalore",
                "Karnataka", "India", "560001"));

        ElementUser user = new ElementUser("Rajeev Kumar Singh", "rajeev@callicoder.com",
                phoneNumbers, addresses);

        //userRepository.save(user);
        return "";
    }
}

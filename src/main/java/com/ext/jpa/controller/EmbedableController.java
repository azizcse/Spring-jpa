package com.ext.jpa.controller;

import com.ext.jpa.model.embated.Address;
import com.ext.jpa.model.embated.EUser;
import com.ext.jpa.model.embated.Name;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmbedableController {
    public String save(){
        Name name = new Name("Rajeev", "Kumar", "Singh");
        Address address = new Address("747", "Golf View Road", "Bangalore", "Karnataka", "India", "560008");
        EUser user = new EUser(name, "rajeev@callicoder.com", address);

        //userRepository.save(user);
        return "";
    }
}

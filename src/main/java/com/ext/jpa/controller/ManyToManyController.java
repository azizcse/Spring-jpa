package com.ext.jpa.controller;

import com.ext.jpa.model.manytomany.MPost;
import com.ext.jpa.model.manytomany.Tag;
import com.ext.jpa.model.onetomany.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ManyToManyController {
    public String save(){
        // Create a Post
        MPost post = new MPost("Hibernate Many to Many Example with Spring Boot",
                "Learn how to map a many to many relationship using hibernate",
                "Entire Post content with Sample code");

        // Create two tags
        Tag tag1 = new Tag("Spring Boot");
        Tag tag2 = new Tag("Hibernate");


        // Add tag references in the post
        post.getTags().add(tag1);
        post.getTags().add(tag2);

        // Add post reference in the tags
        tag1.getPosts().add(post);
        tag2.getPosts().add(post);

        //postRepository.save(post);
        return "";
    }
}

package com.ext.jpa.repo.onetomany;

import com.ext.jpa.model.onetomany.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Long> {
}

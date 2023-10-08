package com.ext.jpa.repo.element;

import com.ext.jpa.model.element.ElementUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementRepo extends JpaRepository<ElementUser, Long> {
}

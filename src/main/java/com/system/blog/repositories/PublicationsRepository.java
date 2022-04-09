package com.system.blog.repositories;

import com.system.blog.entities.Publications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationsRepository extends JpaRepository<Publications, Long> {
}

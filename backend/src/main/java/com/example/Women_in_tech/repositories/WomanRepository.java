package com.example.Women_in_tech.repositories;
import com.example.Women_in_tech.models.Woman;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WomanRepository extends JpaRepository<Woman, Long> {
    List<Woman> findByName(String name);
}
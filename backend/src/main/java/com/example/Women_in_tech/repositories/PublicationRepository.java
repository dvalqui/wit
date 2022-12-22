package com.example.Women_in_tech.repositories;

import com.example.Women_in_tech.models.Publication;
import com.example.Women_in_tech.models.Woman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
    List<Publication> findByWoman(Woman woman);


}

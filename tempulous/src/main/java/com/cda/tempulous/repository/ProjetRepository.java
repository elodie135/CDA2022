package com.cda.tempulous.repository;

import com.cda.tempulous.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
    public List<Projet> findByNameContainig(String name);
}

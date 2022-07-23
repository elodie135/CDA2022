package com.cda.tempulous.repository;

import com.cda.tempulous.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TempsRepository extends JpaRepository<Agent, Long> {
    public List<Agent> findByNameContainig(String name);
}

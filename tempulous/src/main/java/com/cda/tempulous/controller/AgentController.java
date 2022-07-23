package com.cda.tempulous.controller;

import com.cda.tempulous.entity.Agent;
import com.cda.tempulous.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AgentController {

    @Autowired
    AgentRepository repository;

    @GetMapping("/agent/{id}")
    public List<Agent> list(){
        List<Agent> agents =new ArrayList<>();
        repository.findAll().forEach(agents::add);
        return agents;
    }
}

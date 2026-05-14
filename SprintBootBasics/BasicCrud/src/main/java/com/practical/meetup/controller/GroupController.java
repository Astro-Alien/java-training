package com.practical.meetup.controller;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import com.practical.meetup.model.group.Group;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/groups")
class GroupController {

    private List<Group> groups = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(0);

    public GroupController() {
        groups.add(new Group(
                idCounter.incrementAndGet(),
                "Beginner Java Group",
                "A starter project with obviously bad practices cause we learning",
                "Kaldore",
                "Astro-Alien",
                LocalDate.of(2018, 5, 13)
        ));

        groups.add(new Group(
                idCounter.incrementAndGet(),
                "Spring Boot Masters",
                "Building enterprise-grade REST APIs with Spring Boot and PostgreSQL",
                "RavenTech",
                "Cyber-Wolf",
                LocalDate.of(2020, 8, 21)
        ));

        groups.add(new Group(
                idCounter.incrementAndGet(),
                "Kafka Event Streamers",
                "Learning asynchronous messaging and event-driven architecture with Kafka",
                "NovaCore",
                "Neon-Phoenix",
                LocalDate.of(2021, 11, 3)
        ));

        groups.add(new Group(
                idCounter.incrementAndGet(),
                "Microservice Architects",
                "Designing scalable backend systems using Java microservices and Docker",
                "TitanForge",
                "Quantum-Drake",
                LocalDate.of(2019, 2, 17)
        ));
    }

    @GetMapping("/")
    List<Group> getAllGroups() {
        return groups;
    }

    @GetMapping("/{id}")
    Optional<Group> getGroupById(@PathVariable Long id) {
        return groups.stream()
                .filter(item -> item.id().equals(id))
                .findFirst();
    }

    @PostMapping("/")
    Group save(@RequestBody Group group) {
        if (group.id() == null) {
            Group newGroup = new Group(
                    idCounter.incrementAndGet(),
                    group.name(),
                    group.description(),
                    group.city(),
                    group.organizer(),
                    group.createdDate() != null ? group.createdDate() : LocalDate.now()
            );
            groups.add(newGroup);
            return newGroup;
        }

        groups.removeIf(item -> item.id().equals(group.id()));
        groups.add(group);
        return group;

    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id) {
        groups.removeIf(group -> group.id().equals(id));
    }
}

//NB * I am aware this controller is breaking SRP
package com.example.Aquarium.fishes;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface FishRepository extends MongoRepository<Fish, Integer> {
    public List<Fish> findAll();

    public Optional<Fish> findFirstById(Integer id);

    public Optional<Fish> findFirstByType(String type);

}

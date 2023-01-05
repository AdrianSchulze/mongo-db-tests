package com.example.animalsdbtest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimalsRepository extends MongoRepository<Animal, String> {


}

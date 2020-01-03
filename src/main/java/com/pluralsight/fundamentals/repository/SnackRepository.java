package com.pluralsight.fundamentals.repository;

import com.pluralsight.fundamentals.entity.Snack;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnackRepository extends MongoRepository<Snack, String> {
}

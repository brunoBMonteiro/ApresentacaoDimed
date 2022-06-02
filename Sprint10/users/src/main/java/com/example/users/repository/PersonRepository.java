package com.example.users.repository;


import com.example.users.domain.PersonsModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface PersonRepository extends ReactiveMongoRepository<PersonsModel, String> {
    Flux<PersonsModel> findBy();

}

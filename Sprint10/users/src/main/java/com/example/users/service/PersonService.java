package com.example.users.service;

import com.example.users.domain.PersonsModel;
import com.example.users.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Data
@AllArgsConstructor
@Service
@Slf4j
public class PersonService {

    private final PersonRepository personsModelRepository;

    public Mono<PersonsModel> savePerson(PersonsModel personsModel) {
        return personsModelRepository.save(personsModel);
    }


    public Flux<PersonsModel> findAllPersons() {
        return personsModelRepository.findBy();
    }

    public Mono<PersonsModel> findByid(String id) {
        return personsModelRepository.findById(id);
    }

}

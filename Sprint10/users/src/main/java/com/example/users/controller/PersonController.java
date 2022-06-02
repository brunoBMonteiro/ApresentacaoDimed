package com.example.users.controller;


import com.example.users.domain.PersonsModel;
import com.example.users.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/facebook/user/v1")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/person")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<PersonsModel> createPerson(@RequestBody PersonsModel personsModel) {
        return personService.savePerson(personsModel);
    }


    @GetMapping("/allpersons")
    public Flux<PersonsModel> findAllPosts() {
        return personService.findAllPersons();
    }


    @GetMapping(path = "/person/{id}")
    public Mono<PersonsModel> findById(@PathVariable String id) {
        return personService.findByid(id);
    }



}

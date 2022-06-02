package com.example.users.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "persons")
@NoArgsConstructor
public class PersonsModel implements Serializable {
    private static final long serialVersionUID = 2612983025996993766L;

    @Id
    String id;
    String name;
}

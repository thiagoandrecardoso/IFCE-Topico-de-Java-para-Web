package br.edu.ifce.primeiroJPA.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(length = 140)
    private String email;
    private String password;
    @Embedded
    private Address address;

    @ElementCollection
    private Collection<String> phones;

    public User(String name, String email, String password, Address address, Collection<String> phones) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phones = phones;
    }
}

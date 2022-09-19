package br.edu.ifce.primeiroJPA.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @Column(length = 140)
    private String email;
    private String senha;
}

package br.edu.ifce.primeiroJPA.model.dto;

import br.edu.ifce.primeiroJPA.model.Address;
import br.edu.ifce.primeiroJPA.model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String email;
    private String password;
    private Address address;
    private Collection<String> phones;

    public User toMOdel(){
        return new User(name, email, password, address, phones);
    }
}

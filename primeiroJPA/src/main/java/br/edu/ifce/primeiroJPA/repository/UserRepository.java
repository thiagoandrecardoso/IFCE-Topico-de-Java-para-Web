package br.edu.ifce.primeiroJPA.repository;

import br.edu.ifce.primeiroJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
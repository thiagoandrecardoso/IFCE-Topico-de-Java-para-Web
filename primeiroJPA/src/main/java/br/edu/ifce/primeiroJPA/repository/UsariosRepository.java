package br.edu.ifce.primeiroJPA.repository;

import br.edu.ifce.primeiroJPA.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsariosRepository extends JpaRepository<Usuarios, Long> {
}
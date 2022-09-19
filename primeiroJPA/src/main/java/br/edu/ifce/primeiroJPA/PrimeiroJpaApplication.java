package br.edu.ifce.primeiroJPA;

import br.edu.ifce.primeiroJPA.model.User;
import br.edu.ifce.primeiroJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroJpaApplication{
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroJpaApplication.class, args);
	}
}

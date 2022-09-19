package br.edu.ifce.primeiroJPA;

import br.edu.ifce.primeiroJPA.model.Usuarios;
import br.edu.ifce.primeiroJPA.repository.UsariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroJpaApplication implements CommandLineRunner {

	@Autowired
	UsariosRepository rep;

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuarios user = new Usuarios();
		user.setEmail("email@email.com");
		user.setNome("Thiago");
		user.setSenha("TomeDnv");
		rep.save(user);
		System.out.println("TOME");
	}
}

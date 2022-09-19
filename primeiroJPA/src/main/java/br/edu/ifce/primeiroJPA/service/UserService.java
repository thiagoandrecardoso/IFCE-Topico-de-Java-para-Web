package br.edu.ifce.primeiroJPA.service;

import br.edu.ifce.primeiroJPA.model.User;
import br.edu.ifce.primeiroJPA.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void save(User user){
        userRepository.save(user);
    }
}

package br.edu.ifce.primeiroJPA.resource;

import br.edu.ifce.primeiroJPA.model.User;
import br.edu.ifce.primeiroJPA.model.dto.UserRequest;
import br.edu.ifce.primeiroJPA.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserResource {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> saveEntity(@RequestBody UserRequest userRequest){
        User user = userRequest.toMOdel();
        userService.save(user);
        return ResponseEntity.ok(user);
    }
}

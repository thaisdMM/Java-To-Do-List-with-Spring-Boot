package io.github.thaisdmm.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * Modificar
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private IUserRepository userRepository;

  @PostMapping("/")
  public ResponseEntity create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());

    if(user != null) {
      System.out.println("Usuário já existe");
      //Retornar mensagem de erro
      // Status Code - são os "numeros" dos status da requisição ApiDog - por padrão http tem satus code
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
    }
    var userCreated = this.userRepository.save(userModel);
    return userCreated;
  }
  
}

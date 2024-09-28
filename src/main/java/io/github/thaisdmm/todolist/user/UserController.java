package io.github.thaisdmm.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

/**
 * Integer(int) numeros inteiros
 * Date(data)
 * void - nao tem um retorno do método
 */

 /**
  * Body
  */
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
  }
  
}

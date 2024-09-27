package io.github.thaisdmm.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/primeiraRota")
//ROTA: http:/localhost:8080/ ------
public class MinhaPrimeiraController {

  /**
   * Méto de acesso do HTTP
   * GET - Buscar uma informação
   * POST - Adicionar um dado/informação
   * PUT - Alterar um dado/info
   * DELET - Remover um dado
   * PATCH - Alterar somente uma parte da info/dado
   */

   //Método (Funcionalidade) de uma classe

   @GetMapping("/primeiroMetodo")
    public String primeiramensagem() {
    return "Funcionou";
  }
  
}

package io.github.thaisdmm.todolist.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

  @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
              
// Pegar a autenticação(usuário e senha)
              var autorization = request.getHeader("Autorization");
              
              var user_password = autorization.substring("Basic".length()).trim();
              System.out.println("Autorization");
              System.out.println(user_password);



// Validar usuário

// Validar Senha

//Segue viagem

filterChain.doFilter(request, response);
  }
 
}
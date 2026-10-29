package io.github.thaisdmm.todolist.home;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/")
  public Map<String, String> home() {
    return Map.of(
      "name", "To-Do List API",
      "status", "running",
      "documentation", "https://github.com/thaisdMM/Java-To-Do-List-with-Spring-Boot#readme"
    );
  }
}

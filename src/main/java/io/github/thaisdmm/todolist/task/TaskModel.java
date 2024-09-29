package io.github.thaisdmm.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

  /**
   * ID
   * Usuário (ID_USUÁRIO)
   * Descrição
   * Título
   * Data de Início
   * Dta de Término
   * Prioridade
   */

   
public class TaskModel {


   private UUID id;
   private String description;
   private String title;
   private LocalDateTime startAt;
   private LocalDateTime endAt;
   private String priority;

   private LocalDateTime createdAt;

   private UUID idUser;
  
}

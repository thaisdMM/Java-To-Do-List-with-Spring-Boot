package io.github.thaisdmm.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

  /**
   * ID
   * Usuário (ID_USUÁRIO)
   * Descrição
   * Título
   * Data de Início
   * Dta de Término
   * Prioridade
   */
@Data
@Entity(name = "tb_task")

public class TaskModel {

  @Id
  @GeneratedValue(generator = "UUID")

   private UUID id;
   private String description;
   private String title;
   private LocalDateTime startAt;
   private LocalDateTime endAt;
   private String priority;
   
   private UUID idUser;
  
   @CreationTimestamp
   private LocalDateTime createdAt;

}

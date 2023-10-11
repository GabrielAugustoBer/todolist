package com.gabrielaugusto.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    /*
     * ID
     * Usuário (ID_USUARIO)
     * Descrição
     * Título
     * Data de Início
     * Data de Termino
     * Prioridade
     */
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(length = 50)
    private String title;
    private String description, priority;
    private LocalDateTime startAt, endAt;
    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

    

    

}

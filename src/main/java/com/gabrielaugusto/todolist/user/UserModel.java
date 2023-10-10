package com.gabrielaugusto.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
   /*
     * String (texto)
     * Integer (int) Números inteiros
     * double (double) Números 0.0000
     * Float (float) Números 0.000
     * char (A C)
     * Date (data)
     * void
     */
  @Id
  @GeneratedValue(generator = "UUID")
   private UUID id;
   
   @Column(unique = true)
   private String username;
   private String name;
   private String password;
   private String NumeroTel;

   @CreationTimestamp
   private LocalDateTime createdAt;

  /*Setters para inserir um valor
   * 
   * Getters para buscar um valor
   */
  

}

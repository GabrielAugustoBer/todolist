package com.gabrielaugusto.todolist.user;

import lombok.Data;

@Data
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
   
   public String username, name, password;
   private  String  numeroTel;

  /*Setters para inserir um valor
   * 
   * Getters para buscar um valor
   */
  

}

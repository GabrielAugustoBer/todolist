package com.gabrielaugusto.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /*
     * String (texto)
     * Integer (int) Números inteiros
     * double (double) Números 0.0000
     * Float (float) Números 0.000
     * char (A C)
     * Date (data)
     * void
     */

     /*
      * Body
      */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println("O nome é: " + userModel.name );
        System.out.println("O numero do usuario é: " + userModel.getNumeroTel());
    }
}

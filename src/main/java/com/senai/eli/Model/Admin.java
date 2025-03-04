package com.senai.eli.Model;

import com.senai.eli.Validator.Usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Table(name = "admin")
@Entity
@Setter
@Getter
public class Admin {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ultimo_acesso", nullable = false)
    private String ultimoAcesso;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "usuario", nullable = false, unique = true)
    @Usuario
    private String usuario;


}

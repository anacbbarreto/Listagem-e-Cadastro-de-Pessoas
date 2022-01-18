package com.dsw.ado.formulario;

import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Por favor, preencha o nome corretamente")
    private String nomePessoa;

     @NotBlank(message = "Por favor, preencha o email corretamente")
    @Email
    private String email;

     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) // ISO-8601
    @NotNull(message = "Por favor, preencha a data de nascimento corretamente")
    @Past
    private LocalDate dataNascimento;
    
    @Deprecated
    protected Pessoa() {
    }

    public Pessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", dataNascimento=" + dataNascimento + ", nomePessoa=" + nomePessoa + ", email=" + email + '}';
    }

}

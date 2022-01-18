package com.dsw.ado.formulario;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PessoaRepositorio extends JpaRepository <Pessoa, Long  > {
     
   @Query(value= "FROM Pessoa Where DataNascimento = ?1") 
   Pessoa findByDataNascimento(LocalDate DataNascimento);
}

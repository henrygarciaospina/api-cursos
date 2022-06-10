package com.example.curso.dao;

import com.example.curso.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IProfesorDao extends JpaRepository<Profesor, Long> {

    Profesor findByCorreo(String correo);
    Profesor findByCorreoAndClave(String correo, String clave);
    Optional<Profesor> findById(Long id);

    @Query("select p from Profesor p where p.id=?1")
    Profesor findByIdSQL(Long id);

}

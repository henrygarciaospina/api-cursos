package com.example.curso.service;

import com.example.curso.entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface IProfesorService {

    List<Profesor> findAll();
    Profesor findProfesor(Profesor profesor);
    Profesor findById(Long id);
    Profesor findByIdSQL(Long id);
    Profesor checkProfesorLogin(Profesor profesor);
    void deleteProfesor(Profesor profesor);
    void deleteProfesor(Long id);
    Profesor updateProfesor(Profesor profesor);
    Optional<Profesor> findProfesorById(Long id);
    void save(Profesor profesor);
}

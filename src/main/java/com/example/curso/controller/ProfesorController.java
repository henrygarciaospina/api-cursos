package com.example.curso.controller;

import com.example.curso.entity.Profesor;
import com.example.curso.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfesorController {

    @Autowired
    private IProfesorService profesorService;

    @GetMapping("/profesores")
    @ResponseStatus(HttpStatus.OK)
    public List<Profesor> obtenerProfesores(){ return profesorService.findAll(); }

    @PostMapping("sign_up")
    public ResponseEntity<Void> agregarProfesor(@RequestBody Profesor profesor){
        if (profesorService.findProfesor(profesor)==null){
            profesorService.save(profesor);
            return new ResponseEntity<Void>(HttpStatus.CREATED);
        }else{
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
}

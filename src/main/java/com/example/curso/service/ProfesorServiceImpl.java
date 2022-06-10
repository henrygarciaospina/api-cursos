package com.example.curso.service;

import com.example.curso.dao.IProfesorDao;
import com.example.curso.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceImpl implements IProfesorService{
   @Autowired
   private IProfesorDao profesorDao;

    @Override
    @Transactional
    public List<Profesor> findAll() {
        return (List<Profesor>) profesorDao.findAll();
    }

    @Override
    @Transactional
    public Profesor findProfesor(Profesor profesor) {
        return (Profesor) profesorDao.findByCorreo(profesor.getCorreo());
    }

    @Override
    @Transactional
    public Profesor findById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public Profesor findByIdSQL(Long id) {
        return profesorDao.findByIdSQL(id);
    }

    @Override
    @Transactional
    public Profesor checkProfesorLogin(Profesor profesor) {
        return (Profesor) profesorDao.findByCorreoAndClave(profesor.getCorreo(), profesor.getClave());
    }

    @Override
    @Transactional
    public void deleteProfesor(Profesor profesor) {
        profesorDao.deleteById(profesor.getId());
    }

    @Override
    @Transactional
    public void deleteProfesor(Long id) {
        profesorDao.deleteById(id);
    }

    @Override
    @Transactional
    public Profesor updateProfesor(Profesor profesor) {
        return (Profesor) profesorDao.save(profesor);
    }

    @Override
    @Transactional
    public Optional<Profesor> findProfesorById(Long id) {
        return (Optional<Profesor>) profesorDao.findById(id);
    }

    @Override
    @Transactional
    public void save(Profesor profesor) {
        profesorDao.save(profesor);
    }
}

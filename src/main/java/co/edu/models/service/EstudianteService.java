package co.edu.models.service;

import java.util.List;
import java.util.Optional;

import co.edu.models.entity.Estudiante;

public interface EstudianteService {
    List<Estudiante> findAll();
    Optional<Estudiante> findById(Integer id);
    Estudiante save(Estudiante estudiante);
    void deleteById(Integer id);
}

package co.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.models.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}

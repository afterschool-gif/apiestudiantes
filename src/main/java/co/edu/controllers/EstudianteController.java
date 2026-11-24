package co.edu.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.models.entity.Estudiante;
import co.edu.models.service.EstudianteService;

@RestController
@RequestMapping("/api/estudiantes")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.POST })
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/{id}")
    public Optional<Estudiante> buscarPorId(@PathVariable Integer id) {
        return estudianteService.findById(id);
    }

    @GetMapping("/listar")
    public List<Estudiante> listarTodos() {
        return estudianteService.findAll();
    }

    @PostMapping
    public Estudiante guardar(@RequestBody Estudiante e) {
        return estudianteService.save(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        estudianteService.deleteById(id);
    }

    @PutMapping("/actualizar/{id}")
    public Estudiante actualizar(@RequestBody Estudiante e, @PathVariable Integer id) {
        Estudiante eBD = estudianteService.findById(id).get();
        eBD.setNombre(e.getNombre());
        eBD.setApellido(e.getApellido());
        eBD.setFechaNacimiento(e.getFechaNacimiento());
        eBD.setNivel(e.getNivel());
        eBD.setClase(e.getClase());
        return estudianteService.save(eBD);
    }
}

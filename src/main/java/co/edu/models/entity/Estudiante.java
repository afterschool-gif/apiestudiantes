package co.edu.models.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @Column(name = "cod_est")
    private Integer codigo;

    @Column(name = "nom_est")
    private String nombre;

    @Column(name = "ape_est")
    private String apellido;

    @Column(name = "fec_nac_est")
    private LocalDate fechaNacimiento;

    @Column(name = "niv_est")
    private String nivel;

    @Column(name = "cla_est")
    private String clase;

    public Integer getCodigo() { return codigo; }
    public void setCodigo(Integer codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getClase() { return clase; }
    public void setClase(String clase) { this.clase = clase; }
}

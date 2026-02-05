package co.edu.uniandes.dse.TallerPersistencia.entities;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class DesarrolladorEntity extends BaseEntity {

private String nombre;
private String correo;

@OneToMany
private TareaEntity tarea;


    
}

package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class ProyectoEntity {
    
   @OneToMany
   private TareaEntity tarea;

   private String nombre;
   private String descripcion;
   




}

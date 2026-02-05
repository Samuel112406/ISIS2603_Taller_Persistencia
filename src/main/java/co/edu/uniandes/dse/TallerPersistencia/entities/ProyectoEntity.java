package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class ProyectoEntity {
    
   @OneToMany(mappedBy = "proyecto", orphanRemoval = true)
   private List<TareaEntity> tarea;

   private String nombre;
   private String descripcion;
   




}

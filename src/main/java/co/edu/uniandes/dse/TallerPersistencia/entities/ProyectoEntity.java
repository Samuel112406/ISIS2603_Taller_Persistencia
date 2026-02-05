package co.edu.uniandes.dse.TallerPersistencia.entities;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class ProyectoEntity {
    
   @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<TareaEntity> tarea;

   private String nombre;
   private String descripcion;
   




}

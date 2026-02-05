package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;



@Entity

public class TareaEntity extends BaseEntity{
    
    @ManyToOne
    private ProyectoEntity proyecto;

    @OneToMany
    private DesarrolladorEntity desarrollador;
    
    private String titulo;
    private String estado;
    private Integer duracionEstimada;

    
    


   

}

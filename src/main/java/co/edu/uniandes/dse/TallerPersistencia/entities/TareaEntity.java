package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToMany;

import java.util.Set;
import java.util.HashSet;


@Entity

public class TareaEntity extends BaseEntity{
    
    @ManyToOne 
    private ProyectoEntity proyecto;
    
    private String titulo;
    private String estado;
    private Integer duracionEstimada;

    @OneToMany
    private DesarrolladorEntity desarrollador;


   

}

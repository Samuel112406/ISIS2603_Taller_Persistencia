package co.edu.uniandes.dse.TallerPersistencia.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import co.edu.uniandes.dse.TallerPersistencia.entities.TareaEntity;

public interface TareaRepository extends JpaRepository<TareaEntity,Long> {

    List<TareaEntity>findByEstado(String estado);
    
}

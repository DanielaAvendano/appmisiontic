
package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Reservation;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela Avendano
 */
@Repository
public interface ReservationCrudRepository extends CrudRepository<Reservation, Long> {
    //    Metodo de Spring JPA para buscar las reservas por id
    public List <Reservation> findAllByIdReservation(Long idReservation);
    
}

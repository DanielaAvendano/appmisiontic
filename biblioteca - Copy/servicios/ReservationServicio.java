
package gov.co.misiontic.ciclo3.usa.biblioteca.servicios;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud.ReservationCrudRepository;
import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Reservation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela Avendano
 */
@Service
public class ReservationServicio {
//    Inyectamos el servicio con autowired
    @Autowired
    ReservationCrudRepository reservationRepo;
    
    
   
//    Metodo heredado de crudrepository para guardar
    public void guardarReservation(Reservation reservation){
        reservationRepo.save(reservation);
    }
//    Metodo heredado de crudrepository para buscar
    public List<Reservation>buscarTodoReservation(){
        return (List<Reservation>)reservationRepo.findAll();
    }
//    Metodo heredado de crudrepository para buscar por id
    public Reservation buscarporidReservation(Long idReservation){
        return reservationRepo.findById(idReservation).orElse(null);
    }
//    Metodo heredado de crudrepository para eliminar
    public void eliminaridReservation(Long idReservation){
        reservationRepo.deleteById(idReservation);
    }
  
}

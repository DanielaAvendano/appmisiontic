
package gov.co.misiontic.ciclo3.usa.biblioteca.controladores;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Reservation;
import gov.co.misiontic.ciclo3.usa.biblioteca.servicios.ReservationServicio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Daniela Avendano
 */
@RestController
@RequestMapping("/api")
public class ControladorReservation {
    
    @Autowired
    ReservationServicio reservationServicio;
    
    @GetMapping("/Reservation/all")
    public List<Reservation> buscarReservation() {
        return reservationServicio.buscarTodoReservation();
    }

    @GetMapping("/Reservation/{id}")

    public Reservation get(@PathVariable("id") Long idReservation) {
        return reservationServicio.buscarporidReservation(idReservation);
    }
  
    @PutMapping("/Reservation/{id}")
    public ResponseEntity<?> put(@RequestBody Reservation reservation) {
        reservationServicio.guardarReservation(reservation);
        return ResponseEntity.status(201).build();
    }
    
    @PostMapping("/Reservation/save")
    public ResponseEntity<?> post(@RequestBody Reservation reservation) {
        reservationServicio.guardarReservation(reservation);
        return ResponseEntity.status(201).build();
    }
    
 
    
    @DeleteMapping("/Reservation/{id}")
    public ResponseEntity<?> delete(@PathVariable ("id")Long idReservation) {
        reservationServicio.eliminaridReservation(idReservation);
        return ResponseEntity.status(204).build();
    }
    
    
}

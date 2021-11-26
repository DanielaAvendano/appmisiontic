package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author Daniela Avendano
 */
@Data
@Entity
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservation;
    
    private Date startDate;
    
    private Date devolutionDate;
    
    private String status = "created";
  
         
    @ManyToOne
    @JoinColumn(name="library_id")
    @JsonIgnoreProperties({"reservations"})
    private Library lib;
    
    @ManyToOne
    @JoinColumn(name="client_id")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client; 
    
    
    @ManyToOne
    @JoinColumn(name="id_score")
    private Score score;
}


package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author Daniela Avendano
 */
@Data
@Entity
public class Message implements Serializable {
//Genero los atributos de la Entidad Message
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;
    
    @Column(length = 250)
    private String messageText;
    
    //   Relacion con bibliotecas , la clase mensaje tiene un objeto biblioteca 
    @ManyToOne
    @JoinColumn(name="library_id")
    @JsonIgnoreProperties({"messages","reservations"})
    private Library lib;
   
    
//    Relacion con la tabla de clientes, la clase mensaje tiene un objeto cliente
    @ManyToOne
    @JoinColumn(name="client_id")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;

}

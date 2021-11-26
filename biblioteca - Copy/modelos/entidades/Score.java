
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
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author Daniela Avendano
 */
@Data
@Entity
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;
 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Integer id;
    
    @Column(length = 250)
    private String scoreMessage;
    
 

}

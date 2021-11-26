package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author Daniela Avendano
 */
@Data
@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    
   
    
    @Column(length = 45)
    private String  email;
    
    @Column(length = 45)
    private String password;
    
    @Column(length = 250)
    private String name;
    
    private Integer age;
    
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties({"lib","client"})
    public List <Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties({"lib","client"})
    public List <Reservation> reservations;
    
 
    
  
    
}

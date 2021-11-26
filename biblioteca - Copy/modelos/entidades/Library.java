
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author Daniela Avendano
 */

@Data
@Entity

public class Library implements Serializable {

//    Genero las tablas con los atributos que le corresponden al objeto library
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//  Atributo Name
    @Column(length = 45)
    private String name;
//  Atributo target
    @Column(length = 45)
    private String target;
    
//  Atributo capacity
    private Integer capacity;

//  Atributo descripcion
    @Column(length = 250)
    private String description;
//    Conexion de bD a la otra entidad category
    @ManyToOne
    @JoinColumn(name="category_id")
    @JsonIgnoreProperties("libs")
    private Category category;
   
      
   
    //    Conexion de bD a la otra entidad messages
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="client")
    @JsonIgnoreProperties({"category","lib","client"})
    public List <Message> messages;
        //    Conexion de bD a la otra entidad reservations
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="lib")
    @JsonIgnoreProperties("lib")
    public List <Reservation> reservations;
   
}

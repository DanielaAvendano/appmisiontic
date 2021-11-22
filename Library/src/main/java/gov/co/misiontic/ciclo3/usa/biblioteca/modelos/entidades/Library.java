
package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @Column(length = 45)
    private String target;
    private Integer capacity;
    private Integer category_id;
    @Column(length = 45)
    private String name;
    @Column(length = 250)
    private String description;

}

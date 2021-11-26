
package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Client;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela Avendano
 */
@Repository
public interface ClientCrudRepository extends CrudRepository<Client, Long> {
       //    Metodo de Spring JPA para buscar los clientes por id
    public List <Client> findAllByIdClient(Long idClient);
}

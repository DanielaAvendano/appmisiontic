package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Message;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela Avendano
 */
@Repository
public interface MessageCrudRepository extends CrudRepository<Message, Long> {
     //    Metodo de Spring JPA para buscar las bibliotecas por id
    public List <Message> findAllByIdMessage(Long idMessage);
    
}

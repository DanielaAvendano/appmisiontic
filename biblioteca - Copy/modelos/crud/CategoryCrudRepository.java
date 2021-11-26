
package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Category;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela Avendano
 */
@Repository
public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
     //    Metodo de Spring JPA para buscar las bibliotecas por id
    public List <Category> findAllById(Integer id);

}

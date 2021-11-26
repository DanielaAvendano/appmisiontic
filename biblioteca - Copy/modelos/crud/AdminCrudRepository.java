
package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Admin;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela Avendano
 */
@Repository
public interface AdminCrudRepository extends CrudRepository<Admin, Integer> {
      public List <Admin> findAllById(Integer id);
}

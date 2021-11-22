package gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Library;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Daniela Avendano
 */

@Repository
public interface LibraryCrudRepository extends CrudRepository<Library, Long> {
//    Metodo de Spring JPA para buscar las bibliotecas por id
    public List <Library> findAllById(Long id);
    @Query("SELECT u FROM Library u")
    public List<Library> buscarCubiculos();
}

package gov.co.misiontic.ciclo3.usa.biblioteca.servicios;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Library;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud.LibraryCrudRepository;

/**
 *
 * @author Daniela Avendano
 */
@Service
public class LibraryServicio {
    @Autowired
    LibraryCrudRepository libraryRepo;
    
    public void guardarLibrary(Library library){
        libraryRepo.save(library);
    }
    
    public List<Library> buscarTodoLibrary(){
        return (List<Library>)libraryRepo.findAll();
    }
    
    public Library buscarporidLibrary(Long id){
        return libraryRepo.findById(id).orElse(null);
    }
    
    public void eliminaridLibrary(Long id){
        libraryRepo.deleteById(id);
    }
    
}
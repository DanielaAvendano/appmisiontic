package gov.co.misiontic.ciclo3.usa.biblioteca.controladores;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Library;
import gov.co.misiontic.ciclo3.usa.biblioteca.servicios.LibraryServicio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Daniela Avendano
 */
@RestController
@RequestMapping("/api")
public class ControladorLibrary {
    
  
    @Autowired
    LibraryServicio libraryServicio;
            
    @GetMapping("/lib/all")
    public List<Library> buscarTodo() {
        return libraryServicio.buscarTodoLibrary();
    }
    
    @GetMapping("/lib/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Library get(@PathVariable("id") Long id) {
        return libraryServicio.buscarporidLibrary(id);
    }
    
    @PostMapping("/lib/save")
    public ResponseEntity <?> post(@RequestBody Library library) {
        libraryServicio.guardarLibrary(library);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/lib/update")
    public ResponseEntity  <?> put(@RequestBody Library library) {
        libraryServicio.guardarLibrary(library);
        return ResponseEntity.status(201).build();
    }
    
    
    @DeleteMapping("/lib/{id}")
    public ResponseEntity  <?> delete(@PathVariable("id") Long id) {
        libraryServicio.eliminaridLibrary(id);
        return ResponseEntity.status(204).build();
    }
    
}

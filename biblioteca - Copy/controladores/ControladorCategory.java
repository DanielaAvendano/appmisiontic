
package gov.co.misiontic.ciclo3.usa.biblioteca.controladores;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Category;
import gov.co.misiontic.ciclo3.usa.biblioteca.servicios.CategoryServicio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author Daniela Avendano
 */
@RestController
@RequestMapping("/api")
public class ControladorCategory {
    
    @Autowired
    CategoryServicio categoryServicio;
    
    @GetMapping("/Category/all")
    public List<Category> buscarCategory() {
        return categoryServicio.buscarTodoCategory();
    }
    
    @GetMapping("/Category/{id}")
    public Category get(@PathVariable ("id") Integer id) {
        return categoryServicio.buscarporidCategory(id);
    }
    
    @PutMapping("/Category/update")
    public ResponseEntity<?> put(@RequestBody Category category) {
        categoryServicio.guardarCategory(category);
        return ResponseEntity.status(201).build();
    }
    
    @PostMapping("/Category/save")
    public ResponseEntity<?> post(@RequestBody Category category) {
        categoryServicio.guardarCategory(category);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/Category/{id}")
    public ResponseEntity<?> delete(@PathVariable ("id") Integer id){
        categoryServicio.eliminaridCategory(id);
        return ResponseEntity.status(204).build();
    }
    
}

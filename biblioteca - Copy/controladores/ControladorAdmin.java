
package gov.co.misiontic.ciclo3.usa.biblioteca.controladores;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Admin;
import gov.co.misiontic.ciclo3.usa.biblioteca.servicios.AdminServicio;
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
public class ControladorAdmin {
   
    @Autowired
    AdminServicio adminServicio;
            
    @GetMapping("/Admin/all")
    public List<Admin> buscarTodoAdmin() {
        return adminServicio.buscarTodoAdmin();
    }
    
    @GetMapping("/Admin/{id}")
   
    public Admin get(@PathVariable("id") Integer id) {
        return adminServicio.buscarporidAdmin(id);
    }
    
    @PostMapping("/Admin/save")
    public ResponseEntity <?> post(@RequestBody Admin admin) {
        adminServicio.guardarAdmin(admin);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/Admin/update")
    public ResponseEntity  <?> put(@RequestBody Admin admin) {
        adminServicio.guardarAdmin(admin);
        return ResponseEntity.status(201).build();
    }
    
    
    @DeleteMapping("/Admin/{id}")
    public ResponseEntity  <?> delete(@PathVariable("id") Integer id) {
        adminServicio.eliminaridAdmin(id);
        return ResponseEntity.status(204).build();
    }
    
}

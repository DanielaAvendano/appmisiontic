
package gov.co.misiontic.ciclo3.usa.biblioteca.controladores;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Client;
import gov.co.misiontic.ciclo3.usa.biblioteca.servicios.ClientServicio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
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
public class ControladorClient {
    @Autowired
    ClientServicio clientServicio;
    
    @GetMapping("/Client/all")
    public List<Client> buscarClient() {
        return clientServicio.buscarTodoClient();
    }
    
    
    @GetMapping("/Client/{idClient}")

    public Client get(@PathVariable ("idClient")Long idClient) {
        return clientServicio.buscarporidClient(idClient);
    }
    
    @PutMapping("/Client/update")
    public ResponseEntity<?> put( @RequestBody Client cliente) {
        clientServicio.guardarClient(cliente);
        return ResponseEntity.status(201).build();
    }
    
 
    @PostMapping("/Client/save")
    public ResponseEntity<?> post(@RequestBody Client cliente) {
        clientServicio.guardarClient(cliente);
        return ResponseEntity.status(201).build();
    }

    
    @DeleteMapping("/Client/{idClient}")
    public ResponseEntity<?> delete(@PathVariable("idClient") Long idClient) {
        clientServicio.eliminaridClient(idClient);
        return ResponseEntity.status(204).build();
    }
    
}

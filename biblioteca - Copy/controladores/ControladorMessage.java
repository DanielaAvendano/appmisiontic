package gov.co.misiontic.ciclo3.usa.biblioteca.controladores;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Message;
import gov.co.misiontic.ciclo3.usa.biblioteca.servicios.MessageServicio;
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
public class ControladorMessage {
    
    @Autowired
    MessageServicio messageServicio;
    
    @GetMapping("/Message/all")
    public List<Message> buscarMessage() {
        return messageServicio.buscarTodoMessage();
    }
      
     
    @GetMapping("/Message/{id}")
    public Message get(@PathVariable("id") Long idMessage) {
        return messageServicio.buscarporidMessage(idMessage);
    }
    
    @PutMapping("/Message/update")
    public ResponseEntity<?> put(@RequestBody Message message) {
        messageServicio.guardarMessage(message);
        return ResponseEntity.status(201).build();
    }
        
    @PostMapping("/Message/save")
    public ResponseEntity<?> post(@RequestBody Message message) {
        messageServicio.guardarMessage(message);
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping("/Message/{id}")
    public ResponseEntity<?> delete(@PathVariable ("id")Long idMessage) {
        messageServicio.eliminaridMessage(idMessage);
        return ResponseEntity.status(204).build();
    }

}

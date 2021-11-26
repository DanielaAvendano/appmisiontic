package gov.co.misiontic.ciclo3.usa.biblioteca.servicios;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud.MessageCrudRepository;
import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela Avendano
 */
@Service
public class MessageServicio {
   @Autowired
    MessageCrudRepository messageRepo;
    
    public void guardarMessage(Message message){
        messageRepo.save(message);
    }
    
    public List<Message> buscarTodoMessage(){
        return (List<Message>)messageRepo.findAll();
    }
    
    public Message buscarporidMessage(Long idMessage){
        return messageRepo.findById(idMessage).orElse(null);
    }
    
    public void eliminaridMessage(Long idMessage){
        messageRepo.deleteById(idMessage); 
    }
}

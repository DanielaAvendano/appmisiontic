
package gov.co.misiontic.ciclo3.usa.biblioteca.servicios;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud.ClientCrudRepository;
import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud.LibraryCrudRepository;
import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Client;
import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Library;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela Avendano
 */
@Service
public class ClientServicio {
    @Autowired
    ClientCrudRepository clientRepo;
    
    public void guardarClient(Client cliente){
        clientRepo.save(cliente);
    }
    
    public List<Client> buscarTodoClient(){
        return (List<Client>)clientRepo.findAll();
    }
    
    public Client buscarporidClient(Long idClient){
        return clientRepo.findById(idClient).orElse(null);
                
    }
    
    public void eliminaridClient(Long idClient){
        clientRepo.deleteById(idClient);
    }
}

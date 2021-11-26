
package gov.co.misiontic.ciclo3.usa.biblioteca.servicios;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud.AdminCrudRepository;
import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Admin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela Avendano
 */
@Service
public class AdminServicio {
    @Autowired
    AdminCrudRepository adminRepo;
    
    public void guardarAdmin(Admin admin){
        adminRepo.save(admin);
    }
    
    public List<Admin> buscarTodoAdmin(){
        return (List<Admin>)adminRepo.findAll();
    }
    
    public Admin buscarporidAdmin(Integer id){
        return adminRepo.findById(id).orElse(null);
    }
    
    public void eliminaridAdmin(Integer id){
        adminRepo.deleteById(id);
    }
}

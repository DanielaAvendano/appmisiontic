
package gov.co.misiontic.ciclo3.usa.biblioteca.servicios;

import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.crud.CategoryCrudRepository;
import gov.co.misiontic.ciclo3.usa.biblioteca.modelos.entidades.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniela Avendano
 */
@Service
public class CategoryServicio {
    
    @Autowired
    CategoryCrudRepository categoryRepo;
    
    public void guardarCategory(Category category){
        categoryRepo.save(category);
    }
    public List<Category>buscarTodoCategory(){
        return (List<Category>)categoryRepo.findAll();
    }
    public Category buscarporidCategory(Integer id){
        return categoryRepo.findById(id).orElse(null);
    }
    public void eliminaridCategory(Integer id){
        categoryRepo.deleteById(id);
    }
}

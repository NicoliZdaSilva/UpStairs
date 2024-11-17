package Model;

import Dao.Identifier;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Professor extends Pessoa implements Identifier{
    
   @OneToMany(mappedBy = "professor")
   private List<Turma> turmas = new ArrayList<>();
   
   public Professor(){
       
   }
        
}

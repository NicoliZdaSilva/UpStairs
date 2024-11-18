package Controller;

import Dao.AdministradorDAO;
import Dao.AlunoDAO;
import Dao.ProfessorDAO;
import Model.Administrador;
import Model.Aluno;
import Model.Pessoa;
import Model.Professor;
import javax.swing.JFrame;

public class LoginController {
    
    public static JFrame telaHome;
    public static Pessoa people;
    
    public LoginController(){
        
    }
    
    public  Pessoa login(String user, String password){
            AdministradorDAO adm = new AdministradorDAO();
            ProfessorDAO prof = new ProfessorDAO();
            AlunoDAO alu = new AlunoDAO();
            
            Administrador admin = adm.findByEmail(user);
            if(admin == null){
                Professor pr = prof.findByEmail(user);
                if(pr == null){
                    Aluno al = alu.findByEmail(user);
                    if(al == null){
                        
                        return null;
                    }
                    if(al.getSenha().equals(password)){
                        
                        return al;
                    }
                 }
                if(pr.getSenha().equals(password))
                    return pr;
            }
            
            if(admin.getSenha().equals(password)){
                
                return admin;
         
            } 
            return null;
    }
    
    
    
}

package Controller;

import Dao.AdministradorDAO;
import Dao.AlunoDAO;
import Dao.ProfessorDAO;
import Model.Administrador;
import Model.Aluno;
import Model.Pessoa;
import Model.Professor;
import javax.swing.JOptionPane;

public class CadastroController {
    
    public CadastroController(){
        
    }
    
    public Boolean criarAdm(String email, String nome, String senha, String matricula){
        Administrador adm = new Administrador();
        AdministradorDAO ad = new AdministradorDAO();
        
        if (ad.findByEmail(email) != null || email.isBlank()) {
        JOptionPane.showMessageDialog(null, "Erro: E-mail já cadastrado ou inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false; 
    } else {
        
        adm.setEmail(email);
        adm.setNome(nome);
        adm.setSenha(senha);
        adm.setMatricula(matricula);
        
        ad.save(adm);
         JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        return true;
        }
    }
    
    public Boolean criarProf(String email, String nome, String senha, String matricula){
        Professor profe = new Professor();
        ProfessorDAO pro = new ProfessorDAO();
        
        if (pro.findByEmail(email) != null || email.isBlank()) {
        JOptionPane.showMessageDialog(null, "Erro: E-mail já cadastrado ou inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false; 
    }else{
        
        profe.setEmail(email);
        profe.setNome(nome);
        profe.setSenha(senha);
        profe.setMatricula(matricula);
        
        pro.save(profe);
         JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        return true;
        }
    }
    public Boolean criarAluno(String email, String nome, String senha, String matricula){
        Aluno alu = new Aluno();
        AlunoDAO aluno = new AlunoDAO();
        
        if (aluno.findByEmail(email) != null || email.isBlank() ) {
        JOptionPane.showMessageDialog(null, "Erro: E-mail já cadastrado ou inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false; 
        }else {
        
        alu.setEmail(email);
        alu.setNome(nome);
        alu.setSenha(senha);
        alu.setMatricula(matricula);
        
        aluno.save(alu);
         JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        return true;
        }
    
    }
    
}

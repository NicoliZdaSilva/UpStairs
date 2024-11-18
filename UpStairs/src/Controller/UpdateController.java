/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.AdministradorDAO;
import Dao.AlunoDAO;
import Dao.ProfessorDAO;
import Model.Administrador;
import Model.Aluno;
import Model.Professor;
import javax.swing.JOptionPane;

public class UpdateController {
    
    public UpdateController(){
        
    }
    
    public boolean updateAdm(String email, String senha){
        AdministradorDAO ad = new AdministradorDAO();
        Administrador adm = new Administrador();
        
        if (ad.findByEmail(email) != null || email.isBlank()) {
        JOptionPane.showMessageDialog(null, "Erro: E-mail já cadastrado ou inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false; 
    } else {
        
        adm.setEmail(email);
        adm.setSenha(senha);
        
        
        ad.update(adm);
         JOptionPane.showMessageDialog(null, "Administrador atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        return true;
        }
    }
    
    public boolean updateProf(String email, String senha){
        ProfessorDAO prof = new ProfessorDAO();
        Professor pf = new Professor();
        
        if (prof.findByEmail(email) != null || email.isBlank()) {
        JOptionPane.showMessageDialog(null, "Erro: E-mail já cadastrado ou inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false; 
    } else {
        
        pf.setEmail(email);
        pf.setSenha(senha);
        
        
        prof.update(pf);
         JOptionPane.showMessageDialog(null, "Professor atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        return true;
        }
        
        
        
    }
    
    public boolean updateAlu(String email, String senha){
        AlunoDAO ad = new AlunoDAO();
        Aluno alu = new Aluno();
        
        if (ad.findByEmail(email) != null || email.isBlank()) {
        JOptionPane.showMessageDialog(null, "Erro: E-mail já cadastrado ou inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        return false; 
    } else {
        
        alu.setEmail(email);
        alu.setSenha(senha);
        
        
        ad.update(alu);
         JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        return true;
        }
        
    }
        
}

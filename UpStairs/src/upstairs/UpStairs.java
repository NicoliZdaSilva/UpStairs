package upstairs;

import Dao.AdministradorDAO;
import Dao.AlunoDAO;
import Dao.IGenericDAO;
import Model.Administrador;
import Model.Aluno;

public class UpStairs {

    public static void main(String[] args) {
        
        System.out.println("OK");
        var dao = new AdministradorDAO();
        var adm = new Administrador();
        adm.setNome("Sophia");
        adm.setEmail("soso@gmail.com");
        adm.setSenha("123456");
        dao.save(adm);
//        var alunos = dao.findAll();
//        
//        alunos.forEach((k,v) -> System.out.println("K: " + k + ", V: " + v.toString()));
    }
    
    public static void testarDAO(IGenericDAO dao){
        dao.find(0);
    }
    
}

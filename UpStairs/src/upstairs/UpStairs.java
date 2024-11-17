package upstairs;

import Dao.AlunoDAO;
import Dao.IGenericDAO;
import Model.Aluno;

public class UpStairs {

    public static void main(String[] args) {
        
        System.out.println("OK");
        var dao = new AlunoDAO();
        var aluno = new Aluno();
        aluno.setNome("Lucas");
        aluno.setEmail("luukascastro@gmail.com");
//        dao.save(aluno);
        var alunos = dao.findAll();
        
        alunos.forEach((k,v) -> System.out.println("K: " + k + ", V: " + v.toString()));
    }
    
    public static void testarDAO(IGenericDAO dao){
        dao.find(0);
    }
    
}

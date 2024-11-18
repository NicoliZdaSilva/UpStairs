package upstairs;

import Dao.AlunoDAO;
import Dao.IGenericDAO;
import Model.Aluno;

public class UpStairs {

    public static void main(String[] args) {
        
        System.out.println("OK");
        var dao = new AlunoDAO();
        var aluno = new Aluno();
        aluno.setNome("Thaiane Bento de Almeida");
        aluno.setEmail("thaiane3112@gmail.com");
        aluno.setSenha("1234567");
        dao.save(aluno);
//        var alunos = dao.findAll();
//        
//        alunos.forEach((k,v) -> System.out.println("K: " + k + ", V: " + v.toString()));
    }
    
    public static void testarDAO(IGenericDAO dao){
        dao.find(0);
    }
    
}

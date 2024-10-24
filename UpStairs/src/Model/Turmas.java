package Model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turmas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    protected String nome;
    protected Professor professor;
    protected ArrayList<Aluno> Alunos;
    protected boolean presenca; // Não mexido ainda
    
    public Turmas (){
        this.Alunos = new ArrayList<Aluno>();
    }
    public void addAluno(Aluno umAluno){
        this.Alunos.add(umAluno);
    }
    public ArrayList<Aluno> getAlunos(){
        return this.Alunos;
    }   
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

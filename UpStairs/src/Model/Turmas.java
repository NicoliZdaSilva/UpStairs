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
    protected ArrayList<Aluno> alunos;
        
    public Turmas(){
        this.alunos = new ArrayList<Aluno>();
    }
       
    public long getId() {
        return id;
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
    
    public String toString(){
        String text = "";
        text = "Id: " + this.id;
        text += "\nNome da turma: " + this.nome;
        text += "\nProfessor: " + this.professor;
        text += "\n Alunos: \n";
        
        for(Aluno alu: this.alunos){
            text += alu.toString() + "\n";
        }
      return text;
    }
    
    public void addAluno(Aluno umAluno){
        this.alunos.add(umAluno);
    }
    
    public void removeAluno(Aluno umAluno){
        this.alunos.remove(umAluno);
    }
    
    public ArrayList<Aluno> getAlunos(){
        return this.alunos;
    }   
    
}

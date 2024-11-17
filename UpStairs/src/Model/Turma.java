package Model;

import Dao.Identifier;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Turma implements Identifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    protected String nome;
    
    @ManyToOne
    private Professor professor;
    
    @OneToMany(mappedBy = "turma")
    protected List<Aluno> alunos = new ArrayList<>();
        
    public Turma(){
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
    
    public List<Aluno> getAlunos(){
        return this.alunos;
    }   
    
}

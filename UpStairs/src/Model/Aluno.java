package Model;

import Dao.Identifier;
import java.util.ArrayList;
import javax.persistence.Entity;
import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Aluno extends Pessoa implements Identifier{
    private String matricula;
    
    @ManyToOne
    private Turma turma;
    
    @OneToMany(mappedBy = "aluno")
    private List<Nota> notas = new ArrayList<>();
    
    private List<Boolean> presenca; 
    
    public Aluno(){
        presenca = new ArrayList<Boolean>();

    }
    
    public  String getMatricula(){
        return this.matricula;
    }
    
    public String toString(){
        String text= super.toString();
        text+= ", Matricula: " + this.matricula;
       
        return text;
    }
    
    public void addNota(double valor){
        Nota nota = new Nota(valor);
        this.notas.add(nota);
    }
    
    public void excluirNota(int index){
       this.notas.remove(index);
    }
    
    public List<Nota> getNotas(){
        return this.notas;
    }
    
    public double calcularMedia(){
        double notasMedia = notas.stream()
                .mapToDouble(obj -> obj.getNota())
                .average()
                .getAsDouble();
        
        return notasMedia;
    }
    
    public void addPresenca(Boolean presente){
        this.presenca.add(presente);
    }
    
    public void removerPresenca(int index){
        this.presenca.remove(index);
    }
    
    public boolean verificarFrequencia(int qtdAulas){
        var qtd = presenca.stream()
                    .filter( obj -> obj == true )
                    .count();
        
        if(qtd/qtdAulas < 0.7){
            return false;
        }
        
        return true;
    }
    
    
    
    
    
}

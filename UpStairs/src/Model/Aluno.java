package Model;

import java.util.ArrayList;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Aluno extends Pessoa{
    protected String matricula;
    protected ArrayList<Nota> notas;
    protected List<Boolean> presenca; 
    
    public Aluno(){
        notas = new ArrayList<Nota>();
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
    
    public ArrayList<Nota> getNotas(){
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

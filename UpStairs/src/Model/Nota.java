package Model;

public class Nota {
    private double valor;
    
    public Nota(){
        this.valor = 0.0;
    }
    public Nota(double valor){
        this.valor = valor;
    }
    
    public double getNota(){
        return this.valor;
    }
    
    public void setNota(double nota){
        this.valor = nota;
    }
}

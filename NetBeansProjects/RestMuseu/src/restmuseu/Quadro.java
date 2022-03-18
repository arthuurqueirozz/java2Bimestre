
package restmuseu;

public class Quadro {
    //atributos:
    String autor;
    String tipoTinta;
    double valor;
    int anoCriacao;
    double peso;
    
    //métodos:
    int calcularIdade(){
        return 2021 - this.anoCriacao;
    }
    
    void leiloarQuadro(double lance){
        if(this.valor>=lance){
        System.out.println("Lance baixo.");
        } else {
        System.out.println("Quadro leiloado com sucesso!.");
        }
    }    
    boolean restauracao(){
        return calcularIdade() > 20; 
    }    
    
    
}// fim da classe 

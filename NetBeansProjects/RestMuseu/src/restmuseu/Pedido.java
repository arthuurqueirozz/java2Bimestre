
package restmuseu;



public class Pedido {
  //atributos: 
    String prato;
    int codigo;
    int mesa;
    double valor;
    String status;
    
  //métodos:
    int fazerPedido(){
       this.codigo += 1; 
        return this.codigo;
    }
    
    void cancelarPedido(int codigo){
        System.out.println("Cancelando o pedido " + codigo);
    }
    
    double calcularPedido(double descontoPercentagem){
        if(descontoPercentagem>0){
        return this.valor *(100.0 - descontoPercentagem)/100 ;
        } else{
        return this.valor;
        }
    }
}


package br.cesupa.financeiro;

public class Cliente {
    void visualizar(){
        Boleto b1 = new Boleto();
        System.out.println("Valor do boleto: " + b1.valor);
    }
}

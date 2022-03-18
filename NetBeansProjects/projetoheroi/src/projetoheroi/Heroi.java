
package projetoheroi;

import java.util.Random;

public class Heroi {
    // atributos
    private String nome;
    private String poder;
    private double dano;
    
    //métodos de configuração (getters e setters)
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if(nome.length() > 1){
            this.nome = nome;
        } else{
            System.out.println("ERRO! Nome inválido.");
            System.exit(0); //encerra o programa
        }
    } 
    
    public void setPoder(String poder){
        if(nome.length() > 1){
            this.poder = poder;
        } else{
            System.out.println("ERRO! Poder inválido.");
            System.exit(0); //encerra o programa
        }
    } 
    
    public String getPoder(){
        return this.poder;
    }
    
    public void setDano(double dano){
        if(dano >= 500 || dano > 0 ){
            this.dano = dano;
        } else{
            System.out.println("ERRO! Dano inválido.");
            System.exit(0); // encerra o programa
        }
    } 
    
    public Double getDano(){
        return this.dano;
    }
    
    //métodos
    double ataque() {
        Random r = new Random();
        double ataque = (this.dano * r.nextDouble())+1;
        return ataque;
    }
    //construtores não parametrizado
    public Heroi() {
    }
    //parametrizado
    public Heroi(String nome, String poder, double dano) {
        this.setNome(nome);
        this.setPoder(poder);
        this.setDano(dano); 
    }
}

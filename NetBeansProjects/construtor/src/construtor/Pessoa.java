
package construtor;

public class Pessoa {
    //atributos
      private String nome;
      private String cpf;
      
      public void setNome(String nome){
          if(nome.length() > 1){
              this.nome = nome; 
          } else{
              this.nome = "ERRO";
          }
      }
      
      public void setCpf(String cpf){
          if(cpf.length() == 14){
              this.cpf = cpf;
          } else{
              this.cpf = "ERRO";
          }
      }
      
      public String getNome(){
          return this.nome;
      }
      
      public String getCpf(){
          return this.cpf;
      }
      
    //métodos
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
    
    // contrustores: 
    public Pessoa(){
        System.out.println("Construtor vazio!");
    }
    
    // parametrizado
    public Pessoa(String nome, String cpf){
        System.out.println("CONSTRUTOR PARAMETIZADO!");
        this.setNome(nome);
        this.setCpf(cpf);
        
    }
}
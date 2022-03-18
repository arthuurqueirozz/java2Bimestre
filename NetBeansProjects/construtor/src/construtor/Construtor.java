
package construtor;

public class Construtor {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
     //   p1.nome = "Maria";
     //   p1.cpf = "123.123.123-11";
        
        p1.setCpf("123.456.789-11");
        p1.setNome("Arthur Queiroz");
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());
        
     //  p1.imprimir();
        
        Pessoa p2 = new Pessoa("", "");
        p2.imprimir();
        
    }
    
}

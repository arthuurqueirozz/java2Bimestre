
package projetoheroi;


public class Projetoheroi {

    
    public static void main(String[] args) {
        //objetos
        Heroi batman = new Heroi();
        
        //parametrizado(passagem amanual de valores)
        batman.setNome ("Batman");
        batman.setPoder ("Dinheiro");
        batman.setDano (80);
        
        System.out.println("Atributos do Batman: ");
        System.out.println("Nome: " + batman.getNome());
        System.out.println("Poder: " + batman.getPoder());
        System.out.println("Dano: " + batman.getDano());
        
        //parametrizado(atribuição de valores direto no construtor) 
        Heroi aranha = new Heroi("spiderman", "soltar teia", 95);
        System.out.println("Atributos do aranha: ");
        System.out.println("Nome: " + aranha.getNome());
        System.out.println("Poder: " + aranha.getPoder());
        System.out.println("Dano: " + aranha.getDano());
        
        System.out.println("BATALHA");
        System.out.printf("Batman %.2f vs %.2f Aranha ", 
                batman.ataque(), aranha.ataque());
    }

    
    
}

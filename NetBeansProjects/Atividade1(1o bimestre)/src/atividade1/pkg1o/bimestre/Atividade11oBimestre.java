
package atividade1.pkg1o.bimestre;


public class Atividade11oBimestre {

    public static void main(String[] args) {
        Video v1 = new Video();
        v1.canal = "30PRAUM";
        v1.dislike = false;
        v1.like = false;
        v1.inscricao = false;
        v1.nome = "É Sal";
        
        v1.inscricao(v1.inscricao);
        v1.compartilhar();
        v1.like(v1.like);
        v1.dislike(v1.dislike);
        
        Video v2 = new Video("Fade to Black", true, "Metallica",true, false);
        System.out.println(v2.nome);
        System.out.println(v2.canal);
        System.out.println(v2.like);
        System.out.println(v2.dislike);
        System.out.println(v2.inscricao);
    }
    
}

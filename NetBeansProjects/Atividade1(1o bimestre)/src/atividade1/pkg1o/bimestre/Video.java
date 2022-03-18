
package atividade1.pkg1o.bimestre;

public class Video {
    Boolean like;
    String nome;
    Boolean dislike;
    Boolean inscricao;
    String canal;

//métodos
public Boolean like(Boolean like){
    if(like == false){
        System.out.println("Adicionados aos vídeos marcados com 'gostei'.");
        like = true;
    } else{
        System.out.println("Removido dos vídeos marcados com 'gostei'.");
        like = false;
    }
    return like;
}

public Boolean dislike(Boolean dislike){
    if(this.like == false){
        System.out.println("Você marcou esse vídeo como 'não gostei'.");
        dislike = true;
    } else{
        System.out.println("Marcação 'não gostei' removida.");
        dislike = false;
    }
    return dislike;
}

public Boolean inscricao(Boolean inscricao){
    if(inscricao == false){
        System.out.println("Incrição adicionada.");
        inscricao = true;
    } else{
        System.out.println("Cancelada a inscrição de " + this.nome);
        inscricao = false; 
    }
    return inscricao;
}

void compartilhar(){
    System.out.println("Vídeo compartilhado");
}

//contrutores
public Video(){ 
}

public Video(String nome, Boolean inscricao, String canal, Boolean like, Boolean dislike){
    this.canal = canal;
    this.dislike = dislike;
    this.inscricao = inscricao;
    this.like = like;
    this.nome = nome;
}

}

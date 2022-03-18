
package restmuseu;


public class RestMuseu {

    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.codigo = 1;
        p.mesa = 13;
        p.prato = "filé";
        p.status = "Confirmado";
        p.valor = 27.00;
        System.out.println("Fazer pedido: " + p.fazerPedido());
        double valorPedido = p.calcularPedido(10);
        System.out.println("Valor do pedido R$ " + valorPedido);
        p.cancelarPedido(3);
    
        //Quadro
        Quadro monalisa = new Quadro();
        monalisa.anoCriacao = 1503;
        monalisa.autor = "Leonardo da Vinci";
        monalisa.peso = 49.00;
        monalisa.tipoTinta = "Óleo sobre tela";
        monalisa.valor = 5500000;
    
        int idade = monalisa.calcularIdade();
        System.out.println("Idade do quadro: " + monalisa.calcularIdade());
        monalisa.leiloarQuadro(6500000);
        System.out.println("restauração? " + monalisa.restauracao());
    }
    
}

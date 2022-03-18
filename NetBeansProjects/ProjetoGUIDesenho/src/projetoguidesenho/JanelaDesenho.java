
package projetoguidesenho;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaDesenho extends JFrame{
    PainelDesenho painelDesenho = new PainelDesenho();
    JLabel lbAjuda = new  JLabel("Arraste o mouse para desenhar");
    
    public void montarTela(){
        setTitle("Faça seu desenho");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(painelDesenho);
        add(lbAjuda);
        setVisible(true);
    }
}

import javax.swing.JOptionPane;

public class texto {
    public static void main(String[] args){
        boolean resultado = true;
    while(resultado == true){ 
        float resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Quer continuar?", "title", JOptionPane.INFORMATION_MESSAGE);
        if(resposta == JOptionPane.OK_CANCEL_OPTION){
            resultado = false;
        }
    }
    }
}

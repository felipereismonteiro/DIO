import javax.swing.JOptionPane;
public class App{
    public static void main(String[] args){    
        boolean resposta = true;
        while(resposta){
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try{    
                float resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
                JOptionPane.showMessageDialog(null, resultado, "PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, resultado, "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, resultado, "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, resultado, "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
                resposta = false;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um numero inteiro" + e.getMessage());
                e.printStackTrace(); //para imprimir a exception mesmo com o catch 
                // esse e é um objeto entao ele tem os metodos desse exeption acima
            }catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Entrada inválida, número 0 não é permitido");
                e.printStackTrace();
            }
            finally{
                System.out.println("Chegou até aqui");
            }
        }        
    }
    public static int dividir(int a, int b){return a / b;}
}
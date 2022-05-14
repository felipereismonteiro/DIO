import javax.swing.JOptionPane;

public class conta {
    public static void main(String[] args){
        boolean cont = true;
        while(cont == true){           
            try{
                String a = JOptionPane.showInputDialog(null, "n1");         
                String b = JOptionPane.showInputDialog(null, "n2");
                String c = JOptionPane.showInputDialog(null, "Seu resultado");
    
                int soma = (Integer.parseInt(a) + Integer.parseInt(b));
                int res = (Integer.parseInt(c));
                if(res == soma){
                    JOptionPane.showMessageDialog(null,"Resultado correto, Parabens!!!","True",JOptionPane.INFORMATION_MESSAGE);
                    int C = JOptionPane.showConfirmDialog(null, "Deseja continuar??:  ","Continue...",JOptionPane.INFORMATION_MESSAGE);
                    if(C == 1){
                        cont = false;
                    }
                    if(C == 2){
                        cont= false;
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Resultado errado, tente novamente...", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Digite o valor correto...", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
            
            
        }
    }
}

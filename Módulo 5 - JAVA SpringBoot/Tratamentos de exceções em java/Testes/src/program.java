import javax.swing.JOptionPane;

public class program{
    public static void main(String[] args){
        String a = JOptionPane.showInputDialog(null, "message");
        JOptionPane.showMessageDialog(null, a, "title", JOptionPane.QUESTION_MESSAGE);
    }
}
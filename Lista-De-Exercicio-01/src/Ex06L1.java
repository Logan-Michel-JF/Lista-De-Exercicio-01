import javax.swing.JOptionPane;

public class Ex06L1{

   public static void main(String[] args){

       Double nota01 = Double.parseDouble(JOptionPane.showInputDialog("Nota1: "));
       Double nota02 = Double.parseDouble(JOptionPane.showInputDialog("Nota2: "));
       Double nota03 = Double.parseDouble(JOptionPane.showInputDialog("Nota3: "));
       Double nota04 = Double.parseDouble(JOptionPane.showInputDialog("Nota4: "));
       Double media = (nota01 + nota02 + nota03 + nota04)/4;

       JOptionPane.showMessageDialog(null,
       "\nNota1: " + nota01 + "\nNota2: " + nota02 + "\nNota3: " + nota03 + "\nNota4: " + nota04 
       + "\nMedia: " + media
       );
   }
}
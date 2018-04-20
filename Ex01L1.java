import javax.swing.JOptionPane;

public class Ex01L1{

   public static void main(String[] args){

      int numero = Integer.parseInt(JOptionPane.showInputDialog ("Escolha um Numero"));
      int sucessor = numero +1;
      int antecessor = numero -1;


      JOptionPane.showMessageDialog(null,
      "\nantecessor: " + antecessor + "\nNumero: " + numero + "\nsucessor: " + sucessor);

   }

}

      
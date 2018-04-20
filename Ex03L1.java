import javax.swing.JOptionPane;

public class Ex03L1{

   public static void main(String[] args){

      int numero01 = Integer.parseInt(JOptionPane.showInputDialog ("Escolha Um Numero: "));
      int numero02 = Integer.parseInt(JOptionPane.showInputDialog ("Escolha Outro Numero: "));

      int soma = numero01 + numero02;
      int subtracao = numero01 - numero02;
      int multiplicacao = numero01 * numero02;
      int divisao = numero01 / numero02;
      int produto01 = numero01 * numero01;
      int produto02 = numero02 * numero02;


      JOptionPane.showMessageDialog(null,
      "\nN�mero: " + numero01 + "\nN�mero: " + numero02 + "\nSoma: " + soma + "\nSubtra��o: " + subtracao +
      "\nMultiplica��o: " + multiplicacao + "\nDivis�o: " + divisao + "\nProduto01: " + produto01 + 
      "\nProduto02: " + produto02
      );
      
   }

}
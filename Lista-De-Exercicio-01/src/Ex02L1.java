import javax.swing.JOptionPane;

public class Ex02L1{

   public static void main(String[] args){

      int litros = Integer.parseInt(JOptionPane.showInputDialog ("Quantidade de litros: "));
      int anos = Integer.parseInt(JOptionPane.showInputDialog ("Quantidade de Anos Consumidos: "));
      double valor = Double.parseDouble(JOptionPane.showInputDialog ("Valor Por Litro: "));
   
      int quantidadeTotal = litros * anos * 365;
      double valorPago = valor *quantidadeTotal;

      JOptionPane.showMessageDialog(null,
      "\nLitros: " + litros + "\nAnos:" + anos + "\nValor: " + valor + "\nQuantidade Total: " + quantidadeTotal + 
      "\nValor Pago: " + valorPago);



   }

}
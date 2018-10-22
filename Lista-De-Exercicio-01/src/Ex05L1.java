import javax.swing.JOptionPane;

public class Ex05L1{

   public static void main(String[] args){
     
   String modelo = JOptionPane.showInputDialog("Nome do Modelo: ");
   double valorDoCarro = Double.parseDouble(JOptionPane.showInputDialog ("Valor do Carro: "));
   double valorDaParsela = Double.parseDouble(JOptionPane.showInputDialog ("Valor de Cada Parcela: "));
   int meses = Integer.parseInt(JOptionPane.showInputDialog ("Quantidade de Meses: "));
   double totalDeFinanciamento = valorDaParsela * meses;
   double diferenca = totalDeFinanciamento - valorDoCarro;
       
     JOptionPane.showMessageDialog(null,
     "\nLitros: " + modelo + "\nValor Do Carro: " + valorDoCarro + "\nValor De Cada Parela: " + valorDaParsela + 
     "\nMeses: " + meses + "\nTotal De Financiamento: " + totalDeFinanciamento + 
     "\nDiferenca do Financiamento e o Valor do Carro: " + diferenca
     );

   }

}
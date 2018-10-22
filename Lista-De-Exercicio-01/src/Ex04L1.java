import javax.swing.JOptionPane;

public class Ex04L1{

    public static void main(String[] args){

       int numero = Integer.parseInt (JOptionPane.showInputDialog ("Escolha Um Numero"));
       int numero00 = numero * 0;
       int numero01 = numero * 1;
       int numero02 = numero * 2;
       int numero03 = numero * 3;
       int numero04 = numero * 4;
       int numero05 = numero * 5;
       int numero06 = numero * 6;
       int numero07 = numero * 7;
       int numero08 = numero * 8;
       int numero09 = numero * 9;
       int numero10 = numero * 10;


       JOptionPane.showMessageDialog(null, 
                numero + "x" + "0" + "=" + numero00 
       + "\n" + numero + "x" + "1" + "=" + numero01
       + "\n" + numero + "x" + "2" + "=" + numero02 
       + "\n" + numero + "x" + "3" + "=" + numero03
       + "\n" + numero + "x" + "4" + "=" + numero04
       + "\n" + numero + "x" + "5" + "=" + numero05
       + "\n" + numero + "x" + "6" + "=" + numero06
       + "\n" + numero + "x" + "7" + "=" + numero07
       + "\n" + numero + "x" + "8" + "=" + numero08
       + "\n" + numero + "x" + "9" + "=" + numero09
       + "\n" + numero + "x" + "10" + "=" + numero10
    
      );

   }

}
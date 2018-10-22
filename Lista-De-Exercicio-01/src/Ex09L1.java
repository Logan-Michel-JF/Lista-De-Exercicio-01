import javax.swing.JOptionPane;

public class Ex09L1{

    public static void main(String[] args){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Outro Numero: "));


        JOptionPane.showMessageDialog(null,
        "\nNumero: " + numero1 + "\nNumero: " + numero2
        );

        JOptionPane.showMessageDialog(null,
       
        "\nNumero: " + numero2 + "\nNumero: " + numero1
        );
    }
}
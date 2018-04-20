import javax.swing.JOptionPane;

public class Ex08L1{

    public static void main(String[] args){

        double luz = Double.parseDouble(JOptionPane.showInputDialog("Conta de Luz: "));
        double agua = Double.parseDouble(JOptionPane.showInputDialog("Conta de Agua: "));
        double net = Double.parseDouble(JOptionPane.showInputDialog("Conta da NET: "));
        double vivo = Double.parseDouble(JOptionPane.showInputDialog("Conta da VIVO: "));
        double oi = Double.parseDouble(JOptionPane.showInputDialog("Conta da OI: "));
        double iptu = Double.parseDouble(JOptionPane.showInputDialog("Conta do IPTU: "));
        double ipva = Double.parseDouble(JOptionPane.showInputDialog("Conta IPVA: "));
        double seguroDoCarro = Double.parseDouble(JOptionPane.showInputDialog("Seguro do Carro: "));
        double totalDeTelefone = (net + vivo + oi);
        double totalDeImpostos = (iptu + ipva);
        double totalRestante = (luz + agua + seguroDoCarro);
        double valorTotal = (totalDeTelefone + totalDeImpostos + totalRestante);

        JOptionPane.showMessageDialog(null,
        "\nLuz: " + luz + "\nAgua: " + agua + "\nNET: " + net + "\nVIVO: " + vivo + "\nOI: " + oi + 
        "\nIPTU: " +iptu + "\nIPVA: " + ipva + "\nSeguro do Carro: " + seguroDoCarro + 
        "\nTotal de Telefone: " + totalDeTelefone + "\nTotal de Impostos: " + totalDeImpostos +
        "\nTotal de Restante: " + totalRestante + "\nValor Total: " + valorTotal
        );

    }
}
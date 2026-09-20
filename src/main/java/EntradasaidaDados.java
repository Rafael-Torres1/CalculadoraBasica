import javax.swing.JOptionPane;

public class EntradasaidaDados {

    public String EntradaDados(String mensagemEntrada) {
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    public String SaidaDados(String mensagemSaida) {
        JOptionPane.showMessageDialog(null, mensagemSaida);
        return mensagemSaida;
    }
}
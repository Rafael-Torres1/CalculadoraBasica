import javax.swing.JOptionPane;

public class EntradasaidaDados {

    // Exibe uma caixa de diálogo para receber um valor do usuário
    public String EntradaDados(String mensagemEntrada) {
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    // Exibe uma mensagem ao usuário com o resultado ou uma mensagem informativa
    public String SaidaDados(String mensagemSaida) {
        JOptionPane.showMessageDialog(null, mensagemSaida);
        return mensagemSaida;
    }
}
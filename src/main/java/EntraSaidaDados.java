import javax.swing.*;

public class EntraSaidaDados {

    public String entradaDados(String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    public void saidaDados(String mensagemSaida){
        JOptionPane.showInputDialog(mensagemSaida);
    }
}

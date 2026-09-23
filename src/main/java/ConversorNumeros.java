public class ConversorNumeros {

    // Converte uma String em Integer
    // Se a entrada for inválida, retorna 0
    public Integer StrintToInt(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Converte uma String em Double
    // Se a entrada for inválida, retorna 0.0
    public Double StringToDouble(String num) {
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
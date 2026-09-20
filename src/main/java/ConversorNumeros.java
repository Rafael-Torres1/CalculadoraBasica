public class ConversorNumeros {

    public Integer StrintToInt(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public Double StringToDouble(String num) {
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
}
public class Calculadora {

    private double numero01;
    private double numero02;
    private double resultado;

    public double getNumero01() {
        return numero01;
    }

    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    public double getNumero02() {
        return numero02;
    }

    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    public double getResultado() {
        return resultado;
    }

    public double somar() {
        this.resultado = this.numero01 + this.numero02;
        return this.resultado;
    }

    public double subtrair() {
        this.resultado = this.numero01 - this.numero02;
        return this.resultado;
    }

    public double multiplicar() {
        this.resultado = this.numero01 * this.numero02;
        return this.resultado;
    }

    public double dividir() {
        if (this.numero02 != 0) {
            this.resultado = this.numero01 / this.numero02;
        } else {
            this.resultado = 0;
        }
        return this.resultado;
    }
}